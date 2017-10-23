package jedisManagment;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import redis.clients.jedis.Jedis;
import xmlManagment.HValueType;
import xmlManagment.HmapValueType;
import xmlManagment.XmlMarshall;


public class JedisAWS {
	
	private Jedis j;
	private int connectionRetry = 3;

	private boolean getInstance(String url){
		
		if (j == null)
			j = new Jedis(url);
		
		return checkConnection(url);
	}
	
	private boolean checkConnection(String url) {
		
		if (j == null)
			return false;
		
		if (j.isConnected())
			return true;
		
		int i = 0;
		boolean b = false;
		
		while (!j.isConnected() && i < connectionRetry){
			
			try{
				j.connect();
				b = true;
			}
			catch(Exception e){
				e.printStackTrace();
				System.out.println("Jedis connection exception: tentative n. " + i);
			}
			
			i++;
		}
		return b;
	}
	
	private boolean closeConnection() {
		
		if (j == null)
			return false;
		
		int i = 0;
		boolean b = false;
		
		while (j.isConnected() && i < connectionRetry){
			
			try{
				j.close();
				b = true;
			}
			catch(Exception e){
				e.printStackTrace();
				System.out.println("Jedis close connection exception: tentative n. " + i);
			}
			
			i++;
		}
		return b;
	}
	
	public boolean setList (String url, String key, String[] ss) throws Exception {
				
		if (!getInstance(url))			
			throw new Exception("JEDIS CONNECTION EXCEPTION");
		
		try{
			j.lpush(key, ss);
		}
		catch(Exception e){
			closeConnection();
			throw new Exception(e);
		}
		
		closeConnection();
		
		return true;
	}
	
	public String[] getList (String url, String key) throws Exception {
		
		String[] ss = null;
		List<String> list = null;
		
		if (!getInstance(url))			
			throw new Exception("JEDIS CONNECTION EXCEPTION");
		
		try{
			list = j.lrange(key, 0, -1);
		}
		catch(Exception e){
			closeConnection();
			throw new Exception(e);
		}
				
		ss = new String[list.size()];
		
		for (int i = 0; i < list.size(); i++)
			ss[i] = list.get(i);
		
		closeConnection();
		
		return ss;
	}
	
	public boolean setString (String url, String key, String value) throws Exception {
		
		if (!getInstance(url))			
			throw new Exception("JEDIS CONNECTION EXCEPTION");
		
		try{
			j.set(key, value);
		}
		catch(Exception e){
			closeConnection();
			throw new Exception(e);
		}
		
		closeConnection();
		
		return true;
	}
	
	public String getString (String url, String key) throws Exception {
		
		String value = null;
		
		if (!getInstance(url))			
			throw new Exception("JEDIS CONNECTION EXCEPTION");
					
		try{
			value = j.get(key);
		}
		catch(Exception e){
			closeConnection();
			throw new Exception(e);
		}
		
		closeConnection();
		
		return value;
	}
	
	public boolean setSet (String url, String key, String[] ss) throws Exception {
		
		if (!getInstance(url))			
			throw new Exception("JEDIS CONNECTION EXCEPTION");
		
		try{
			j.sadd(key, ss);
		}
		catch(Exception e){
			closeConnection();
			throw new Exception(e);
		}
		
		closeConnection();
		
		return true;
	}
	
	public String[] getSet (String url, String key) throws Exception {
		
		Set<String> value = null;
		
		if (!getInstance(url))			
			throw new Exception("JEDIS CONNECTION EXCEPTION");
					
		try{
			value = j.smembers(key);
		}
		catch(Exception e){
			closeConnection();
			throw new Exception(e);
		}
		
		String[] ss = new String[value.size()];
		
		Iterator<String> it = value.iterator();
		int i = 0;
		while (it.hasNext()){
			
			ss[i] = it.next();
			i++;
		}
		
		closeConnection();
		
		return ss;
	}
	
	public boolean setHash (String url, String key, String xmlString) throws Exception {
		
		if (!getInstance(url))			
			throw new Exception("JEDIS CONNECTION EXCEPTION");
		
		try{
			HmapValueType hvt = (HmapValueType) XmlMarshall.XmlToProduct(xmlString, new HmapValueType());
			
			for (HValueType hv : hvt.getHValue())			
				j.hset(key, hv.getKey(), hv.getValue());
		}
		catch(Exception e){
			closeConnection();
			throw new Exception(e);
		}
		
		closeConnection();				
		
		return true;
	}
	
	public String getHash (String url, String key) throws Exception {
		
		HashMap<String, String> hm = new HashMap<>();
		
		if (!getInstance(url))			
			throw new Exception("JEDIS CONNECTION EXCEPTION");
					
		try{
			hm = (HashMap<String, String>) j.hgetAll(key);
		}
		catch(Exception e){
			closeConnection();
			throw new Exception(e);
		}
		
		HmapValueType hvt = new HmapValueType();
		
		for (String k : hm.keySet()){
			
			HValueType hv = new HValueType();
			hv.setKey(k);
			hv.setValue(hm.get(k));
			hvt.getHValue().add(hv);
		}
		
		closeConnection();
		
		return XmlMarshall.ObjectToXml(hvt);
	}
	
	public boolean clear (String url, String key) throws Exception {
					
		if (!getInstance(url))			
			throw new Exception("JEDIS CONNECTION EXCEPTION");
					
		try{
			j.del(key);
		}
		catch(Exception e){
			closeConnection();
			throw new Exception(e);
		}
		
		closeConnection();
		
		return true;
	}
	
	public boolean clear (String url) throws Exception {
				
		if (!getInstance(url))			
			throw new Exception("JEDIS CONNECTION EXCEPTION");
			
		try{
			j.flushAll();
		}
		catch(Exception e){
			closeConnection();
			throw new Exception(e);
		}
		
		closeConnection();
		
		return true;
	}
}

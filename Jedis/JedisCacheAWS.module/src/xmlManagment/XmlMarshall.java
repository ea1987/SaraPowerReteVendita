package xmlManagment;

import java.io.StringReader;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class XmlMarshall {

	public static String ObjectToXml(Object obj) throws JAXBException{
		
		String xmlString = "";
		
		Thread.currentThread().setContextClassLoader(obj.getClass().getClassLoader());
        JAXBContext context = JAXBContext.newInstance(obj.getClass());
        Marshaller m = context.createMarshaller();
        
        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE); // To format XML

        StringWriter sw = new StringWriter();
        m.marshal(obj, sw);
        xmlString = sw.toString();

	    return xmlString;
	}	
	
	public static Object XmlToProduct(String xmlString, Object obj) throws JAXBException{
		
		StringReader sr = new StringReader(xmlString);
		
		Thread.currentThread().setContextClassLoader(obj.getClass().getClassLoader());
		JAXBContext jaxbContext = JAXBContext.newInstance("xmlManagment");
		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		
		Object o = jaxbUnmarshaller.unmarshal(sr);
		
		return o;
	}
}

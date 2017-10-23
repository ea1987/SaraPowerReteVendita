//
// Questo file � stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andr� persa durante la ricompilazione dello schema di origine. 
// Generato il: 2017.10.04 alle 01:01:02 PM CEST 
//


package xmlManagment;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per hmapValueType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="hmapValueType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="hValue" type="{http://jedis.com/JedisManagment}hValueType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="hmapValue")
@XmlType(name = "hmapValueType", propOrder = {
    "hValue"
})
public class HmapValueType {

    protected List<HValueType> hValue;

    /**
     * Gets the value of the hValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HValueType }
     * 
     * 
     */
    public List<HValueType> getHValue() {
        if (hValue == null) {
            hValue = new ArrayList<HValueType>();
        }
        return this.hValue;
    }

}

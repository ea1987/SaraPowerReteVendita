//
// Questo file � stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andr� persa durante la ricompilazione dello schema di origine. 
// Generato il: 2017.10.04 alle 01:01:02 PM CEST 
//


package xmlManagment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per valueType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="valueType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="stringValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="listValue" type="{http://jedis.com/JedisManagment}listValueType"/>
 *         &lt;element name="hmapValue" type="{http://jedis.com/JedisManagment}hmapValueType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="valueElement")
@XmlType(name = "valueType", propOrder = {
    "stringValue",
    "listValue",
    "hmapValue"
})
public class ValueType {

    protected String stringValue;
    protected ListValueType listValue;
    protected HmapValueType hmapValue;

    /**
     * Recupera il valore della propriet� stringValue.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStringValue() {
        return stringValue;
    }

    /**
     * Imposta il valore della propriet� stringValue.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStringValue(String value) {
        this.stringValue = value;
    }

    /**
     * Recupera il valore della propriet� listValue.
     * 
     * @return
     *     possible object is
     *     {@link ListValueType }
     *     
     */
    public ListValueType getListValue() {
        return listValue;
    }

    /**
     * Imposta il valore della propriet� listValue.
     * 
     * @param value
     *     allowed object is
     *     {@link ListValueType }
     *     
     */
    public void setListValue(ListValueType value) {
        this.listValue = value;
    }

    /**
     * Recupera il valore della propriet� hmapValue.
     * 
     * @return
     *     possible object is
     *     {@link HmapValueType }
     *     
     */
    public HmapValueType getHmapValue() {
        return hmapValue;
    }

    /**
     * Imposta il valore della propriet� hmapValue.
     * 
     * @param value
     *     allowed object is
     *     {@link HmapValueType }
     *     
     */
    public void setHmapValue(HmapValueType value) {
        this.hmapValue = value;
    }

}

//
// Questo file � stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andr� persa durante la ricompilazione dello schema di origine. 
// Generato il: 2017.10.04 alle 01:01:02 PM CEST 
//


package xmlManagment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per responseType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="responseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="key" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="valueElement" type="{http://jedis.com/JedisManagment}valueType" minOccurs="0"/>
 *         &lt;element name="result" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="responseCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="responseMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="response")
@XmlType(name = "responseType", propOrder = {
    "key",
    "valueElement",
    "result",
    "responseCode",
    "responseMessage"
})
public class ResponseType {

    @XmlElement(required = true)
    protected String key;
    protected ValueType valueElement;
    @XmlElement(required = true)
    protected String result;
    @XmlElement(required = true)
    protected String responseCode;
    protected String responseMessage;

    /**
     * Recupera il valore della propriet� key.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKey() {
        return key;
    }

    /**
     * Imposta il valore della propriet� key.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKey(String value) {
        this.key = value;
    }

    /**
     * Recupera il valore della propriet� valueElement.
     * 
     * @return
     *     possible object is
     *     {@link ValueType }
     *     
     */
    public ValueType getValueElement() {
        return valueElement;
    }

    /**
     * Imposta il valore della propriet� valueElement.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueType }
     *     
     */
    public void setValueElement(ValueType value) {
        this.valueElement = value;
    }

    /**
     * Recupera il valore della propriet� result.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResult() {
        return result;
    }

    /**
     * Imposta il valore della propriet� result.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResult(String value) {
        this.result = value;
    }

    /**
     * Recupera il valore della propriet� responseCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseCode() {
        return responseCode;
    }

    /**
     * Imposta il valore della propriet� responseCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseCode(String value) {
        this.responseCode = value;
    }

    /**
     * Recupera il valore della propriet� responseMessage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseMessage() {
        return responseMessage;
    }

    /**
     * Imposta il valore della propriet� responseMessage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseMessage(String value) {
        this.responseMessage = value;
    }

}

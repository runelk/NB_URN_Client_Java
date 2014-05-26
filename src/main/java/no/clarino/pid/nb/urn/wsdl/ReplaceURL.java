
package no.clarino.pid.nb.urn.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for replaceURL complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="replaceURL">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SSOToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="URN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="oldURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="newURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "replaceURL", propOrder = {
    "ssoToken",
    "urn",
    "oldURL",
    "newURL"
})
public class ReplaceURL {

    @XmlElement(name = "SSOToken")
    protected String ssoToken;
    @XmlElement(name = "URN")
    protected String urn;
    protected String oldURL;
    protected String newURL;

    /**
     * Gets the value of the ssoToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSSOToken() {
        return ssoToken;
    }

    /**
     * Sets the value of the ssoToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSSOToken(String value) {
        this.ssoToken = value;
    }

    /**
     * Gets the value of the urn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURN() {
        return urn;
    }

    /**
     * Sets the value of the urn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURN(String value) {
        this.urn = value;
    }

    /**
     * Gets the value of the oldURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldURL() {
        return oldURL;
    }

    /**
     * Sets the value of the oldURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldURL(String value) {
        this.oldURL = value;
    }

    /**
     * Gets the value of the newURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewURL() {
        return newURL;
    }

    /**
     * Sets the value of the newURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewURL(String value) {
        this.newURL = value;
    }

}

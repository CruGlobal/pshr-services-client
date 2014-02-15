
package org.ccci.soa.pshr.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getStaff complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getStaff">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="serverId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="serverSecret" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="emplid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getStaff", propOrder = {
    "serverId",
    "serverSecret",
    "emplid"
})
public class GetStaff {

    @XmlElement(namespace = "http://service.staff.ccci.org/")
    protected String serverId;
    @XmlElement(namespace = "http://service.staff.ccci.org/")
    protected String serverSecret;
    @XmlElement(namespace = "http://service.staff.ccci.org/")
    protected String emplid;

    /**
     * Gets the value of the serverId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServerId() {
        return serverId;
    }

    /**
     * Sets the value of the serverId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServerId(String value) {
        this.serverId = value;
    }

    /**
     * Gets the value of the serverSecret property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServerSecret() {
        return serverSecret;
    }

    /**
     * Sets the value of the serverSecret property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServerSecret(String value) {
        this.serverSecret = value;
    }

    /**
     * Gets the value of the emplid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmplid() {
        return emplid;
    }

    /**
     * Sets the value of the emplid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmplid(String value) {
        this.emplid = value;
    }

}

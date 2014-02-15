
package org.ccci.soa.pshr.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for usStaffMember complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="usStaffMember">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="employmentInfo" type="{http://service.staff.ccci.org/}usEmployeeInfo" minOccurs="0"/>
 *         &lt;element name="globalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="personalData" type="{http://service.staff.ccci.org/}personalData" minOccurs="0"/>
 *         &lt;element name="spouseEmplid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "usStaffMember", propOrder = {
    "employmentInfo",
    "globalId",
    "personalData",
    "spouseEmplid"
})
public class UsStaffMember {

    protected UsEmployeeInfo employmentInfo;
    protected String globalId;
    protected PersonalData personalData;
    protected String spouseEmplid;

    /**
     * Gets the value of the employmentInfo property.
     * 
     * @return
     *     possible object is
     *     {@link UsEmployeeInfo }
     *     
     */
    public UsEmployeeInfo getEmploymentInfo() {
        return employmentInfo;
    }

    /**
     * Sets the value of the employmentInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link UsEmployeeInfo }
     *     
     */
    public void setEmploymentInfo(UsEmployeeInfo value) {
        this.employmentInfo = value;
    }

    /**
     * Gets the value of the globalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGlobalId() {
        return globalId;
    }

    /**
     * Sets the value of the globalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGlobalId(String value) {
        this.globalId = value;
    }

    /**
     * Gets the value of the personalData property.
     * 
     * @return
     *     possible object is
     *     {@link PersonalData }
     *     
     */
    public PersonalData getPersonalData() {
        return personalData;
    }

    /**
     * Sets the value of the personalData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonalData }
     *     
     */
    public void setPersonalData(PersonalData value) {
        this.personalData = value;
    }

    /**
     * Gets the value of the spouseEmplid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpouseEmplid() {
        return spouseEmplid;
    }

    /**
     * Sets the value of the spouseEmplid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpouseEmplid(String value) {
        this.spouseEmplid = value;
    }

}

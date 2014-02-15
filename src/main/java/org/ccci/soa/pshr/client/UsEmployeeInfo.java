
package org.ccci.soa.pshr.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for usEmployeeInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="usEmployeeInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="activeStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="company" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deptCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deptDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="division" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="effDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="emplStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="employed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hrEditOnly" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="jobCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="jobDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lakeHartMailCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="latestHireDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="locationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="locationDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ministryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ministryDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="origHireDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paygroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="positionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="statusCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subministryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subministryDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="supervisorEmplid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="supported" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="termDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="wwcFreeSubFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "usEmployeeInfo", propOrder = {
    "activeStatus",
    "company",
    "deptCode",
    "deptDescr",
    "division",
    "effDt",
    "emplStatus",
    "employed",
    "hrEditOnly",
    "jobCode",
    "jobDescr",
    "lakeHartMailCode",
    "latestHireDate",
    "locationCode",
    "locationDescr",
    "ministryCode",
    "ministryDescr",
    "origHireDate",
    "paygroup",
    "positionCode",
    "statusCode",
    "subministryCode",
    "subministryDescr",
    "supervisorEmplid",
    "supported",
    "termDate",
    "wwcFreeSubFlag"
})
public class UsEmployeeInfo {

    protected String activeStatus;
    protected String company;
    protected String deptCode;
    protected String deptDescr;
    protected String division;
    protected String effDt;
    protected String emplStatus;
    protected String employed;
    protected String hrEditOnly;
    protected String jobCode;
    protected String jobDescr;
    protected String lakeHartMailCode;
    protected String latestHireDate;
    protected String locationCode;
    protected String locationDescr;
    protected String ministryCode;
    protected String ministryDescr;
    protected String origHireDate;
    protected String paygroup;
    protected String positionCode;
    protected String statusCode;
    protected String subministryCode;
    protected String subministryDescr;
    protected String supervisorEmplid;
    protected String supported;
    protected String termDate;
    protected String wwcFreeSubFlag;

    /**
     * Gets the value of the activeStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActiveStatus() {
        return activeStatus;
    }

    /**
     * Sets the value of the activeStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActiveStatus(String value) {
        this.activeStatus = value;
    }

    /**
     * Gets the value of the company property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompany() {
        return company;
    }

    /**
     * Sets the value of the company property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompany(String value) {
        this.company = value;
    }

    /**
     * Gets the value of the deptCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeptCode() {
        return deptCode;
    }

    /**
     * Sets the value of the deptCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeptCode(String value) {
        this.deptCode = value;
    }

    /**
     * Gets the value of the deptDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeptDescr() {
        return deptDescr;
    }

    /**
     * Sets the value of the deptDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeptDescr(String value) {
        this.deptDescr = value;
    }

    /**
     * Gets the value of the division property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDivision() {
        return division;
    }

    /**
     * Sets the value of the division property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDivision(String value) {
        this.division = value;
    }

    /**
     * Gets the value of the effDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEffDt() {
        return effDt;
    }

    /**
     * Sets the value of the effDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEffDt(String value) {
        this.effDt = value;
    }

    /**
     * Gets the value of the emplStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmplStatus() {
        return emplStatus;
    }

    /**
     * Sets the value of the emplStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmplStatus(String value) {
        this.emplStatus = value;
    }

    /**
     * Gets the value of the employed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployed() {
        return employed;
    }

    /**
     * Sets the value of the employed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployed(String value) {
        this.employed = value;
    }

    /**
     * Gets the value of the hrEditOnly property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHrEditOnly() {
        return hrEditOnly;
    }

    /**
     * Sets the value of the hrEditOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHrEditOnly(String value) {
        this.hrEditOnly = value;
    }

    /**
     * Gets the value of the jobCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobCode() {
        return jobCode;
    }

    /**
     * Sets the value of the jobCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobCode(String value) {
        this.jobCode = value;
    }

    /**
     * Gets the value of the jobDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobDescr() {
        return jobDescr;
    }

    /**
     * Sets the value of the jobDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobDescr(String value) {
        this.jobDescr = value;
    }

    /**
     * Gets the value of the lakeHartMailCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLakeHartMailCode() {
        return lakeHartMailCode;
    }

    /**
     * Sets the value of the lakeHartMailCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLakeHartMailCode(String value) {
        this.lakeHartMailCode = value;
    }

    /**
     * Gets the value of the latestHireDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLatestHireDate() {
        return latestHireDate;
    }

    /**
     * Sets the value of the latestHireDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLatestHireDate(String value) {
        this.latestHireDate = value;
    }

    /**
     * Gets the value of the locationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationCode() {
        return locationCode;
    }

    /**
     * Sets the value of the locationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationCode(String value) {
        this.locationCode = value;
    }

    /**
     * Gets the value of the locationDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationDescr() {
        return locationDescr;
    }

    /**
     * Sets the value of the locationDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationDescr(String value) {
        this.locationDescr = value;
    }

    /**
     * Gets the value of the ministryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinistryCode() {
        return ministryCode;
    }

    /**
     * Sets the value of the ministryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinistryCode(String value) {
        this.ministryCode = value;
    }

    /**
     * Gets the value of the ministryDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinistryDescr() {
        return ministryDescr;
    }

    /**
     * Sets the value of the ministryDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinistryDescr(String value) {
        this.ministryDescr = value;
    }

    /**
     * Gets the value of the origHireDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigHireDate() {
        return origHireDate;
    }

    /**
     * Sets the value of the origHireDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigHireDate(String value) {
        this.origHireDate = value;
    }

    /**
     * Gets the value of the paygroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaygroup() {
        return paygroup;
    }

    /**
     * Sets the value of the paygroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaygroup(String value) {
        this.paygroup = value;
    }

    /**
     * Gets the value of the positionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPositionCode() {
        return positionCode;
    }

    /**
     * Sets the value of the positionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPositionCode(String value) {
        this.positionCode = value;
    }

    /**
     * Gets the value of the statusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusCode() {
        return statusCode;
    }

    /**
     * Sets the value of the statusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusCode(String value) {
        this.statusCode = value;
    }

    /**
     * Gets the value of the subministryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubministryCode() {
        return subministryCode;
    }

    /**
     * Sets the value of the subministryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubministryCode(String value) {
        this.subministryCode = value;
    }

    /**
     * Gets the value of the subministryDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubministryDescr() {
        return subministryDescr;
    }

    /**
     * Sets the value of the subministryDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubministryDescr(String value) {
        this.subministryDescr = value;
    }

    /**
     * Gets the value of the supervisorEmplid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupervisorEmplid() {
        return supervisorEmplid;
    }

    /**
     * Sets the value of the supervisorEmplid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupervisorEmplid(String value) {
        this.supervisorEmplid = value;
    }

    /**
     * Gets the value of the supported property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupported() {
        return supported;
    }

    /**
     * Sets the value of the supported property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupported(String value) {
        this.supported = value;
    }

    /**
     * Gets the value of the termDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTermDate() {
        return termDate;
    }

    /**
     * Sets the value of the termDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTermDate(String value) {
        this.termDate = value;
    }

    /**
     * Gets the value of the wwcFreeSubFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWwcFreeSubFlag() {
        return wwcFreeSubFlag;
    }

    /**
     * Sets the value of the wwcFreeSubFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWwcFreeSubFlag(String value) {
        this.wwcFreeSubFlag = value;
    }

}

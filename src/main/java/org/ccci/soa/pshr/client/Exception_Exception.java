
package org.ccci.soa.pshr.client;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebFault(name = "Exception", targetNamespace = "http://service.staff.ccci.org/")
public class Exception_Exception
    extends java.lang.Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private org.ccci.soa.pshr.client.Exception faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public Exception_Exception(String message, org.ccci.soa.pshr.client.Exception faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public Exception_Exception(String message, org.ccci.soa.pshr.client.Exception faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: org.ccci.soa.pshr.client.Exception
     */
    public org.ccci.soa.pshr.client.Exception getFaultInfo() {
        return faultInfo;
    }

}
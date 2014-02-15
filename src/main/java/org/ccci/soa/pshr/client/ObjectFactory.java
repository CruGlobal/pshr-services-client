
package org.ccci.soa.pshr.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.ccci.soa.pshr.client package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Exception_QNAME = new QName("http://service.staff.ccci.org/", "Exception");
    private final static QName _Person_QNAME = new QName("http://service.staff.ccci.org/", "person");
    private final static QName _GetStaff_QNAME = new QName("http://service.staff.ccci.org/", "getStaff");
    private final static QName _GetStaffResponse_QNAME = new QName("http://service.staff.ccci.org/", "getStaffResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.ccci.soa.pshr.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Name }
     * 
     */
    public Name createName() {
        return new Name();
    }

    /**
     * Create an instance of {@link Phone }
     * 
     */
    public Phone createPhone() {
        return new Phone();
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link Address }
     * 
     */
    public Address createAddress() {
        return new Address();
    }

    /**
     * Create an instance of {@link UsStaffMember }
     * 
     */
    public UsStaffMember createUsStaffMember() {
        return new UsStaffMember();
    }

    /**
     * Create an instance of {@link UsEmployeeInfo }
     * 
     */
    public UsEmployeeInfo createUsEmployeeInfo() {
        return new UsEmployeeInfo();
    }

    /**
     * Create an instance of {@link Email }
     * 
     */
    public Email createEmail() {
        return new Email();
    }

    /**
     * Create an instance of {@link GetStaffResponse }
     * 
     */
    public GetStaffResponse createGetStaffResponse() {
        return new GetStaffResponse();
    }

    /**
     * Create an instance of {@link PersonalData }
     * 
     */
    public PersonalData createPersonalData() {
        return new PersonalData();
    }

    /**
     * Create an instance of {@link GetStaff }
     * 
     */
    public GetStaff createGetStaff() {
        return new GetStaff();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.staff.ccci.org/", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonalData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.staff.ccci.org/", name = "person")
    public JAXBElement<PersonalData> createPerson(PersonalData value) {
        return new JAXBElement<PersonalData>(_Person_QNAME, PersonalData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStaff }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.staff.ccci.org/", name = "getStaff")
    public JAXBElement<GetStaff> createGetStaff(GetStaff value) {
        return new JAXBElement<GetStaff>(_GetStaff_QNAME, GetStaff.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStaffResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.staff.ccci.org/", name = "getStaffResponse")
    public JAXBElement<GetStaffResponse> createGetStaffResponse(GetStaffResponse value) {
        return new JAXBElement<GetStaffResponse>(_GetStaffResponse_QNAME, GetStaffResponse.class, null, value);
    }

}

package org.ccci.soa.pshr.client;

import java.net.URL;

import javax.xml.namespace.QName;

import junit.framework.Assert;

import org.junit.Test;

public class TestPshrClient
{
    //@Test
    public void testPshrClient() throws Throwable
    {
        String wsdlUrl = "http://localhost:8080/pshr/pshr?wsdl";
        String namespace = "http://service.staff.ccci.org/";
        String serviceName = "StaffServiceService";
        URL wsdl = new URL(wsdlUrl);
        QName serviceQname = new QName(namespace, serviceName);
        
        StaffServiceService locator = new StaffServiceService(wsdl, serviceQname);
        StaffService service = locator.getStaffServicePort();
        
        UsStaffMember staff = service.getStaff("SOA", "fakekey", "000477966");
        Assert.assertEquals("Nathan", staff.getPersonalData().getName().getFirstName());
    }
}

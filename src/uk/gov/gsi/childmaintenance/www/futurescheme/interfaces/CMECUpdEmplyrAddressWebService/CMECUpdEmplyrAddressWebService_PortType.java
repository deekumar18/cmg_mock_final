/**
 * CMECUpdEmplyrAddressWebService_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECUpdEmplyrAddressWebService;

public interface CMECUpdEmplyrAddressWebService_PortType extends java.rmi.Remote {
    public uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecUpdEmplyrResponse.CmecUpdEmplyrResponse addEmployerAddress(uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecAddDelEmplyrAddrRequest.CmecAddDelEmplyrAddrRequest addEmplyrAddrRequest) throws java.rmi.RemoteException;
    public uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecUpdEmplyrResponse.CmecUpdEmplyrResponse updateEmployerAddress(uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecUpdEmplyrAddrRequest.CmecUpdEmplyrAddrRequest updEmplyrAddrRequest) throws java.rmi.RemoteException;
    public uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecUpdEmplyrResponse.CmecUpdEmplyrResponse deleteEmployerAddress(uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecAddDelEmplyrAddrRequest.CmecAddDelEmplyrAddrRequest delEmplyrAddrRequest) throws java.rmi.RemoteException;
}

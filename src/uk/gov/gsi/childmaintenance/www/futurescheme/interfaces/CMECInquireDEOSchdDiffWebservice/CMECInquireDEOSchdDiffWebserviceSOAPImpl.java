/**
 * CMECInquireDEOSchdDiffWebserviceSOAPImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECInquireDEOSchdDiffWebservice;

import uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.deoSchedule.CMECInqDEODiffResponse.CMECInqDEODiffResponse;

public class CMECInquireDEOSchdDiffWebserviceSOAPImpl implements
		uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECInquireDEOSchdDiffWebservice.CMECInquireDEOSchdDiffWebservice_PortType {
	public uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.deoSchedule.CMECInqDEODiffResponse.CMECInqDEODiffResponse inqDEOSchdDiff(
			uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.deoSchedule.CMECInqDEODiffRequest.CMECInqDEODiffRequest inqDEOSchdDiffInput)
			throws java.rmi.RemoteException {
		return getCMECInqDEODiffResponse();
	}

	private CMECInqDEODiffResponse getCMECInqDEODiffResponse() {
		return new CMECInqDEODiffResponse();
	}

}

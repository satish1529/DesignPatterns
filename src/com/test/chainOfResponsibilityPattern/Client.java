package com.test.chainOfResponsibilityPattern;

public class Client 
{
	public static void main(String[] args) {
		Request request = new Request();
		request.setValue(1100);
		Approval managerApproval = new ManagerApproval();
		Approval leadApproval  = new LeadApproval();
		managerApproval.setSuccessor(leadApproval);
		managerApproval.handleRequest(request);
	}
}

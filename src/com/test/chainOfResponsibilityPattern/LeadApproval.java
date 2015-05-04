package com.test.chainOfResponsibilityPattern;

public class LeadApproval extends Approval {

	@Override
	public void handleRequest(Request request) {
		if(request.getValue()>0 && request.getValue()<=1000)
		{
			System.out.println("Lead approved : "+request.getValue());
		}
		else
		{
			System.out.println("Approval Rejected!!!!");
		}
	}
}

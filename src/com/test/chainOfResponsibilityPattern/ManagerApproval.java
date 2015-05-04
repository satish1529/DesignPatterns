package com.test.chainOfResponsibilityPattern;

public class ManagerApproval extends Approval {

	@Override
	public void handleRequest(Request request) {
		if(request.getValue()>1000 && request.getValue()<=2000)
		{
			System.out.println("Manager approved : "+request.getValue());
		}
		else
		{
			handler.handleRequest(request);
		}
	}
}

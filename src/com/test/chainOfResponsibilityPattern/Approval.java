package com.test.chainOfResponsibilityPattern;

public abstract class Approval {

	Approval handler ;
	
	public void setSuccessor(Approval handler)
	{
		this.handler = handler;
	}
	
	protected  abstract void handleRequest(Request request);
	
	public final void handleIt(Request request)
	{
		this.handleRequest(request);
		if(handler!=null)
			handler.handleIt(request);
	}
	
}

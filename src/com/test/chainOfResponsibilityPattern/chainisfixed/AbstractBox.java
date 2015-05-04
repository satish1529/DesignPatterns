package com.test.chainOfResponsibilityPattern.chainisfixed;

import java.util.List;

public abstract class AbstractBox {

	AbstractBox handler ;
	
	public void setSuccessor(AbstractBox handler)
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

	public final void handleIt(List<Request> list)
	{
		AbstractBox abstractBox = this;
		for(Request requestBox : list)
		{
			abstractBox.handleRequest(requestBox);
			if(abstractBox.handler!=null)
				abstractBox = abstractBox.handler;
		}
	}
}

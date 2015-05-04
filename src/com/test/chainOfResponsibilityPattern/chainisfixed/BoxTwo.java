package com.test.chainOfResponsibilityPattern.chainisfixed;

public class BoxTwo extends AbstractBox {

	@Override
	public void handleRequest(Request request) {
		System.out.println("Adding to BoxTwo : "+request.getValue());
	}
}

package com.test.chainOfResponsibilityPattern.chainisfixed;

public class BoxOne extends AbstractBox {

	@Override
	public void handleRequest(Request request) {
		System.out.println("Adding to BoxOne : "+request.getValue());
	}
}

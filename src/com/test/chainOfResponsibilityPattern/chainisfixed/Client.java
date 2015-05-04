package com.test.chainOfResponsibilityPattern.chainisfixed;
import java.util.ArrayList;
import java.util.List;

public class Client 
{
	public static void main(String[] args) {
		Request request = new Request();
		request.setValue(1100);
		Request request2 = new Request();
		request2.setValue(1200);
		Request request3 = new Request();
		request3.setValue(1300);
		Request request4 = new Request();
		request4.setValue(1400);
		Request request5 = new Request();
		request5.setValue(1500);
		
		List<Request> list = new ArrayList<Request>();
		list.add(request);
		list.add(request2);
	    list.add(request3);
	    list.add(request4);
	    list.add(request5);
		AbstractBox boxTwo = new BoxTwo();
		AbstractBox boxOne  = new BoxOne();
		boxOne.setSuccessor(boxTwo);
		boxTwo.setSuccessor(boxOne);
		
		boxOne.handleIt(list);
	}
}

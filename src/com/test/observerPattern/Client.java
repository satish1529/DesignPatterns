package com.test.observerPattern;

public class Client {

	public static void main(String[] args) {
		Subject s = SubjectFactory.getInstance();
		s.resgisterObserver(new StockObserverImplOne());
		s.resgisterObserver(new StockObserverImplTwo());
		s.notifyObservers();
	}

}

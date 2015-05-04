package com.test.observerPattern;

public class StockObserverImplOne implements StockObserver {

	
	@Override
	public void uptate(Subject s) {
		System.out.println(" StockObserverImplOne update from "+s);
	}
}

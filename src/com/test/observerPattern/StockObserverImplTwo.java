package com.test.observerPattern;

public class StockObserverImplTwo implements StockObserver {

	@Override
	public void uptate(Subject s) {
		// TODO Auto-generated method stub
		System.out.println(" StockObserverImplTwo update from "+s);
	}

}

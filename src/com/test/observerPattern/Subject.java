package com.test.observerPattern;

public interface Subject {

	void resgisterObserver(StockObserver so);
	
	void deresgisterObserver(StockObserver so);
	
	void notifyObservers();
	
}

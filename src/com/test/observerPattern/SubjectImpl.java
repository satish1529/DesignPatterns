package com.test.observerPattern;

import java.util.ArrayList;
import java.util.List;

public class SubjectImpl implements Subject {

	List<StockObserver> list = new ArrayList<StockObserver>();
	
	@Override
	public void resgisterObserver(StockObserver so) {
		list.add(so);
	}

	@Override
	public void deresgisterObserver(StockObserver so) {
		list.remove(so);
	}

	@Override
	public void notifyObservers() {
		for(StockObserver so : list)
			so.uptate(this);
	}
}

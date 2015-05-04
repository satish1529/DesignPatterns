package com.test.VisitorPattern;

import java.util.ArrayList;
import java.util.List;

public class Orders {

	List<Items> listOfItems = new ArrayList<Items>();
	
	public void accept(BillingVisitor visitor) {
		visitor.visit(this);
		for(Items items : listOfItems)
			items.accept(visitor);
	}

	public void addItem(Items item)
	{
		listOfItems.add(item);
	}
}

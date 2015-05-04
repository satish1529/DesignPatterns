package com.test.VisitorPattern;

public interface Visitable {

	public void accept(BillingVisitor visitor);
	
	public double getAmount();
	
}

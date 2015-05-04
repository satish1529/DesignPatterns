package com.test.VisitorPattern;

public class Items implements Visitable {

	double amount;
	
	Items(double amount)
	{
		this.amount = amount;
	}
	
	@Override
	public void accept(BillingVisitor visitor) {
		visitor.visit(this);
	}

	@Override
	public double getAmount() {
		return this.amount;
	}
}

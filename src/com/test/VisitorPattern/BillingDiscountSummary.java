package com.test.VisitorPattern;
import java.text.DecimalFormat;
public class BillingDiscountSummary extends BillingVisitor {
	int discount;
	
	BillingDiscountSummary(int discount)
	{
		this.discount  = discount;
	}
	
	@Override
	public void defaultvisit(Object object) {
	
	}

	@Override
	public void visit(Orders orders) {
		totalOrders++;
	}

	@Override
	public void visit(Items items) {
		totalItems++;
		totalAmount = totalAmount+items.getAmount();
	}
	
	public void printBillSummary()
	{
		System.out.println("total Oders : "+totalOrders);
		System.out.println("total Items : "+totalItems);
		DecimalFormat df = new DecimalFormat("$00.00");
		System.out.println("total Discounted Amount : "+ df.format((totalAmount-((discount*totalAmount)/100))));
	}
}

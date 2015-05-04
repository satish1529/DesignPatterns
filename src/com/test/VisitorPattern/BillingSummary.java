package com.test.VisitorPattern;
import java.text.DecimalFormat;

public class BillingSummary extends BillingVisitor {

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
		DecimalFormat df = new DecimalFormat("$00.00");
		System.out.println("total Oders : "+totalOrders);
		System.out.println("total Items : "+totalItems);
		System.out.println("totalAmount : "+df.format(totalAmount));
	}
}

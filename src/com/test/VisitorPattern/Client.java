package com.test.VisitorPattern;

public class Client {

	public static void main(String[] args) {
		
		Items item1 = new Items(10);
		Items item2 = new Items(12.2);
		Items item3 = new Items(18.1);
		Items item4 = new Items(40.1);
		Items item5 = new Items(19.3);
		
		Orders order = new Orders();
		order.addItem(item1);
		order.addItem(item2);
		order.addItem(item3);
		order.addItem(item4);
		order.addItem(item5);
		
		BillingVisitor visitor = new BillingSummary();
		order.accept(visitor);
		visitor.printBillSummary();
		
		System.out.println("========35% Discount Summary=======");
		BillingVisitor visitor2 = new BillingDiscountSummary(35);
		order.accept(visitor2);
		visitor2.printBillSummary();
	}
}

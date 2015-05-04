package com.test.AdapterClassPattern;

public class Client {

	public static void main(String[] args) {
		DiscountTarget dt = new DiscountAdater();
		double discountedAmount = dt.getDiscountedAmount(10);
		System.out.println("discounted Amount : "+discountedAmount);
	}
}

package com.test.AdapterObjectPattern;

import java.text.DecimalFormat;

public class DiscountAdater implements DiscountTarget {

	AmountAdaptee amountAdaptee = new AmountAdaptee();
	
	@Override
	public double getDiscountedAmount(int discount) {
		double amount = amountAdaptee.getAmount();
		DecimalFormat df = new DecimalFormat("00.00");
		return Double.valueOf(df.format((amount-((discount*amount)/100)))); 
	}

}

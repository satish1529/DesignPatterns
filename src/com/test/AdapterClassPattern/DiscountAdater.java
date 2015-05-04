package com.test.AdapterClassPattern;

import java.text.DecimalFormat;

public class DiscountAdater extends AmountAdaptee implements DiscountTarget {

	@Override
	public double getDiscountedAmount(int discount) {
		double amount = getAmount();
		DecimalFormat df = new DecimalFormat("00.00");
		return Double.valueOf(df.format((amount-((discount*amount)/100)))); 
	}
}

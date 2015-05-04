package com.test.StrategyPattern;

public class Client {

	public static void main(String[] args) {
		StrategyAlgorithm sa = new MD5Algorithm();
		ContextStrategy cs = new ContextStrategy();
		cs.setStrategyAlgorithm(sa);
		cs.executeAlgorithm();
	}
}

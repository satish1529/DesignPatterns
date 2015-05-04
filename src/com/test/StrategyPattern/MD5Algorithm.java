package com.test.StrategyPattern;

public class MD5Algorithm implements StrategyAlgorithm {

	@Override
	public void executeAlgorithm() {
		System.out.println("MD5 hash algorithm executed");
	}

}

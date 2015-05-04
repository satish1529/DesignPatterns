package com.test.StrategyPattern;

public class ContextStrategy {

	StrategyAlgorithm strategyAlgorithm;
	
	public StrategyAlgorithm getStrategyAlgorithm() {
		return strategyAlgorithm;
	}

	public void setStrategyAlgorithm(StrategyAlgorithm strategyAlgorithm) {
		this.strategyAlgorithm = strategyAlgorithm;
	}

	public void executeAlgorithm()
	{
		if(strategyAlgorithm!=null)
			strategyAlgorithm.executeAlgorithm();
		else
			executeDefaultAlgorithm();
	}
	
	private void executeDefaultAlgorithm()
	{
		System.out.println("Default algorithm executed");
	}
}

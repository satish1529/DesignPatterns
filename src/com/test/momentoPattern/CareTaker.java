package com.test.momentoPattern;


public class CareTaker 
{
	Object momento ;
	
	public void saveSate(Originator originator)
	{
		momento =  originator.saveState();
	}
	
	public void undoState(Originator originator)
	{
		originator.undoState(this.momento);
	}
}

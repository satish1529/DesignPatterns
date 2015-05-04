package com.test.commandPattern;

/**
 * This is receiver
 */
public class Light {

	private boolean on;

	public void switchOn()
	{
		this.on = true;
	}
	
	public void switchOff()
	{
		this.on = false;
	}
}

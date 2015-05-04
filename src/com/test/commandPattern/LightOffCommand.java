package com.test.commandPattern;

public class LightOffCommand implements Command {

	Light light;
	
	LightOffCommand(Light light)
	{
		this.light =light;
	}
	
	@Override
	public void execute() {
		this.light.switchOff();
		System.out.println("Light is switched off.");
	}
}

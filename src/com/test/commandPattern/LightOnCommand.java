package com.test.commandPattern;

public class LightOnCommand implements Command {

	Light light;
	
	LightOnCommand(Light light)
	{
		this.light =light;
	}
	
	@Override
	public void execute() {
		this.light.switchOn();
		System.out.println("Light is switched on.");
	}

}

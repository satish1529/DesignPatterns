package com.test.commandPattern;

public class Invoker {

	Command command;
	
	public void setCommand(Command command)
	{
		this.command = command;
	}
	
	public void execute()
	{
		this.command.execute();
	}
}

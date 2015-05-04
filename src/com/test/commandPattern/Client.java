package com.test.commandPattern;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Light light = new Light();
		Command command = new LightOnCommand(light);
		Invoker invoker = new Invoker();
		invoker.setCommand(command);
		invoker.execute();
	}

}

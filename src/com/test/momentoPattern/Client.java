package com.test.momentoPattern;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Originator originator = new Originator();
		originator.setState("state1");
		
		System.out.println("setting state1 :::::"+originator.getState());
		CareTaker careTaker = new CareTaker();
		careTaker.saveSate(originator);
		System.out.println("state1 is saved");
		originator.setState("state2");
		System.out.println("setting state2 :::::"+originator.getState());
		careTaker.saveSate(originator);
		System.out.println("state2 is saved");
		originator.setState("state3");
		System.out.println("setting state3 :::::"+originator.getState());
		careTaker.undoState(originator);
		System.out.println("after undo :::::"+originator.getState());
	}

}

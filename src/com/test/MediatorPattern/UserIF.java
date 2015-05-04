/**
 * 
 */
package com.test.MediatorPattern;

public  abstract class UserIF {

	String username;
	MediatorIF mediator;
	
	public UserIF(String username,MediatorIF mediator) {
		this.username = username;
		this.mediator = mediator;
	}
	
	public  abstract void receiveMessage(UserIF  user,String message);
	
	public  abstract void sendMessage(String message);
}

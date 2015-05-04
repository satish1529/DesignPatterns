package com.test.MediatorPattern;

public class UserImpl extends UserIF {

	public UserImpl(String username, MediatorIF mediator) {
		super(username, mediator);
	}

	@Override
	public void receiveMessage(UserIF user, String message) {
		System.out.println(this.getUserName()+" received message : \""+message+ "\"");
	}

	@Override
	public void sendMessage(String message) {
		System.out.println(this.getUserName()+" sending message : \""+message+ "\"");
		this.mediator.sendMessage(this, message);
	}

	public String getUserName()
	{
		return this.username;
	}
}

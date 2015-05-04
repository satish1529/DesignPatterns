package com.test.MediatorPattern;

public class Client {

	public static void main(String[] args) {
		MediatorIF chatMediator = new ChatMediator();
		
		UserIF user1 = new UserImpl("user1", chatMediator);
		UserIF user2 = new UserImpl("user2", chatMediator);
		UserIF user3 = new UserImpl("user3", chatMediator);
		UserIF user4 = new UserImpl("user4", chatMediator);
		UserIF user5 = new UserImpl("user5", chatMediator);
		
		chatMediator.addUser(user1);
		chatMediator.addUser(user2);
		chatMediator.addUser(user3);
		chatMediator.addUser(user4);
		chatMediator.addUser(user5);
		
		user1.sendMessage("Hello");
	}
}

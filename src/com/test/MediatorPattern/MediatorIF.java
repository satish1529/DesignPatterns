/**
 * 
 */
package com.test.MediatorPattern;


public interface MediatorIF {

	void addUser(UserIF user);
	
	void sendMessage(UserIF sender,String message);
	
}

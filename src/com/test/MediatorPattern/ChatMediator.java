/**
 * 
 */
package com.test.MediatorPattern;

import java.util.ArrayList;
import java.util.List;

public class ChatMediator implements MediatorIF {

	List<UserIF> listOfUsers = new ArrayList<UserIF>();
	
	@Override
	public void addUser(UserIF user) {
		listOfUsers.add(user);
	}

	@Override
	public void sendMessage(UserIF sender, String message) {
		
		if(message!=null)
		{
			for(UserIF user : listOfUsers)
			{
				if(sender!=user)
					user.receiveMessage(sender, message);
			}
		}
	}
}

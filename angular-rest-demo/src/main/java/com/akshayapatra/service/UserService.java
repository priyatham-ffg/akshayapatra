package com.akshayapatra.service;

import java.util.ArrayList;
import java.util.List;

import com.akshayapatra.norms.domain.User;

public class UserService {
	
	public List<User> getDefaultUser(){
		List<User> users = new ArrayList<User>();
		
		User user1 = new User();
		user1.setFirstName("First1");
		user1.setLastName("Last1");
		
		User user2 = new User();
		user2.setFirstName("First2");
		user2.setLastName("Last2");
		
		users.add(user1);
		users.add(user2);
		
		return users;
	}

}

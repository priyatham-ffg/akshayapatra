package com.akshayapatra.service;

import com.akshayapatra.norms.domain.User;

public class UserService {
	
	public User getDefaultUser(){
		User user = new User();
		user.setFirstName("MyFirstName");
		user.setLastName("MyLastName");
		
		return user;
	}

}

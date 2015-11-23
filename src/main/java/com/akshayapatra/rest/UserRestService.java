package com.akshayapatra.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.akshayapatra.norms.domain.User;
import com.akshayapatra.service.UserService;

@Path("/users")
public class UserRestService {
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public User getDefaultUsreInJSON(){
		UserService userService = new UserService();
		return userService.getDefaultUser();
	}

}

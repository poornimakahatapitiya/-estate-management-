package com.app.registration.controller;
import org.springframework.web.bind.annotation.RestController;

import com.app.registration.model.user;
import com.app.registration.service.registrationService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
@RestController
public class registrationController {
	
	@Autowired
	private registrationService service;
	
	@PostMapping("/registerUser")
	public user registerUser(@RequestBody user user) throws Exception {
		String tempEmailId=user.getEmailId();
		if(tempEmailId!=null&& !"".equals(tempEmailId)) {
			user userObj=service.fetchUserByEmailId(tempEmailId);
			if(userObj!=null) {
				throw new Exception("user with "+tempEmailId+" Already exists");
			}
		}
		user userObj=null;
		service.saveUser(user);
		return userObj;
	}
	@PostMapping("/login")
	public user loginUser(@RequestBody user user) throws Exception {
		String tempEmailId=user.getEmailId();
		String tempPassword= user.getPassword();
		user userObj=null;
		if(tempEmailId!=null&& tempPassword!=null) {
			userObj=service.fetchUserByEmailIdAndPassword(tempEmailId, tempPassword);
		}
		if(userObj==null) {
			throw new Exception("user does not exist please check credential");
		}
		return userObj;
	}
}

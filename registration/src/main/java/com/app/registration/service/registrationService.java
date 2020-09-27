package com.app.registration.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.registration.model.user;
import com.app.registration.repository.registrationRepository;

@Service
public class registrationService {
	@Autowired
	private registrationRepository repo;
	public user saveUser(user user) {
		 return repo.save(user);
	}
	
	public user fetchUserByEmailId(String email) {
		return repo.findByEmailId(email);
	}
	
	public user fetchUserByEmailIdAndPassword(String tempEmailId, String tempPassword) {
		return repo.findByEmailIdAndPassword(tempEmailId,tempPassword);
	}
}

package com.example.poc_gdi.api.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.poc_gdi.api.model.Identity;
import com.example.poc_gdi.api.repository.IdentityRepository;

@RestController
public class IdentityController {

	@Autowired
	private IdentityRepository identityRepository;
	
	@PostMapping("/addIdentity")
	public String saveIdentity(@RequestBody Identity identity) {
		identityRepository.save(identity);
		return "Added Identity with Id:" + identity.toString();
		
	}
	
	
	
}

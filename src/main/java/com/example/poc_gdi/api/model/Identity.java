package com.example.poc_gdi.api.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Identity")
public class Identity {
	@Id
	public String idCrm;
	public String firstName;
	public String lastName;
	@Override
	public String toString() {
		return "Identity [idCrm=" + idCrm + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
	
	
}

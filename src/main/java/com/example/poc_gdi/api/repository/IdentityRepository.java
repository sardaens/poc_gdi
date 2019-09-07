package com.example.poc_gdi.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.poc_gdi.api.model.Identity;

public interface IdentityRepository extends MongoRepository<Identity, Integer>{

}

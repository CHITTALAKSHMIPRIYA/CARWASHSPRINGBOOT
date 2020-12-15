package com.ondemandcarwash.washerService.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ondemandcarwash.washerService.model.WasherModel;

public interface IWasherDAO  extends MongoRepository<WasherModel, String>{

	WasherModel findByEmailId(String emailId);

}

package com.ondemandcarwash.CustomerWashStatus.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ondemandcarwash.CustomerWashStatus.model.WashOrder;


@Repository
public interface IWasherDAO extends MongoRepository<WashOrder, String>{

}

package com.ondemandcarwash.CustomerCarDetails.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ondemandcarwash.CustomerCarDetails.Model.LocationModel;

@Repository
public interface ILocationDAO extends MongoRepository<LocationModel,String>{

}

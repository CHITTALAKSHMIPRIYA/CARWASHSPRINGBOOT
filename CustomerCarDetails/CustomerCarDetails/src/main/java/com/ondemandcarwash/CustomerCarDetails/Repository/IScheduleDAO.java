package com.ondemandcarwash.CustomerCarDetails.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ondemandcarwash.CustomerCarDetails.Model.ScheduleModel;

@Repository
public interface IScheduleDAO extends MongoRepository<ScheduleModel, String>{

}

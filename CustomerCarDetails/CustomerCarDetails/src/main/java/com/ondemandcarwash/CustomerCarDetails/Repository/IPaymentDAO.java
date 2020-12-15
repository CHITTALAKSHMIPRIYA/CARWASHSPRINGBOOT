package com.ondemandcarwash.CustomerCarDetails.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ondemandcarwash.CustomerCarDetails.Model.PaymentModel;

@Repository
public interface IPaymentDAO  extends MongoRepository<PaymentModel,String>{

}

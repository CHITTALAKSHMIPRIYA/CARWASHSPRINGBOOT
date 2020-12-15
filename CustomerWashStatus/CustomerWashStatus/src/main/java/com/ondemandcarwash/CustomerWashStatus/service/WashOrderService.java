package com.ondemandcarwash.CustomerWashStatus.service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ondemandcarwash.CustomerWashStatus.controller.WashStatusController;
import com.ondemandcarwash.CustomerWashStatus.model.WashOrder;
import com.ondemandcarwash.CustomerWashStatus.repository.IWasherDAO;

@Service
public class WashOrderService {
	
	@Autowired
	private IWasherDAO washerRepo;
	private static final Logger logger = LoggerFactory.getLogger(WashOrderService.class);
	
	
	public WashOrder saveOrder(WashOrder order) {
		order.setPaymentStatus(false);
		order.setPaymentId(null);
		order.setOrderStatus("REQUESTED");
		order.setWasherId(null);
		return washerRepo.save(order);

	}

	public WashOrder acceptingOrder(WashOrder order) {
		
		logger.info(order.getOrderId() + "washerId is" + order.getWasherId());
		WashOrder temp = washerRepo.findById(order.getOrderId()).get();

		temp.setWasherId(order.getWasherId());

		temp.setOrderStatus("IN PROGRESS");
		return washerRepo.save(temp);

	}

	public WashOrder orderServed(WashOrder order) {
		WashOrder temp = washerRepo.findById(order.getOrderId()).get();
		temp.setOrderStatus("SERVED");

		return washerRepo.save(temp);

	}

	public WashOrder savingfeedback(WashOrder order) {
		Optional<WashOrder> temp = washerRepo.findById(order.getOrderId());
		if (temp.isPresent()) {
			WashOrder exists = temp.get();
			exists.setRating(order.getRating());
			exists.setComments(order.getComments());
			return washerRepo.save(exists);
		}
		return null;
	}
	
	public List<WashOrder> getOrder()
	{
		return washerRepo.findAll();
	}
    
	public WashOrder getOrderbyStatus(String OrderStatus)
	{
		List<WashOrder> customerRegisterModel=washerRepo.findAll();
		for(WashOrder crm :customerRegisterModel )
		{
			if(crm.getOrderStatus().contentEquals(OrderStatus))
			{
				return crm;
			}
		}
		return null;
		
	}
	
	
	
}

package com.ondemandcarwash.CustomerWashStatus.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ondemandcarwash.CustomerWashStatus.model.WashOrder;
import com.ondemandcarwash.CustomerWashStatus.service.WashOrderService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/carwashstatus")
public class WashStatusController {
	
	@Autowired
	private WashOrderService service;
	
	
	private static final Logger logger = LoggerFactory.getLogger(WashStatusController.class);
	
	@PostMapping("/saveorder")
	@ApiOperation(value = "Saving order")
	public ResponseEntity<WashOrder> saveOrder(@RequestBody WashOrder order) {
		logger.info("Your order status is in: " + order.getOrderStatus()+ " state for the Id "+ order.getOrderId());
		
		//sender.send(order);
		 service.saveOrder(order);
		return new ResponseEntity("order saved Successfully", HttpStatus.OK);
	}

	@PostMapping("/acceptorder")
	@ApiOperation(value = "Washer accepting the order")
	public ResponseEntity<WashOrder> acceptingOrder(@RequestBody WashOrder order) {
		
		logger.info("Your order status: " + order);

		 service.acceptingOrder(order);
		 return new ResponseEntity("order accepted Successfully", HttpStatus.OK);
	}

	@PostMapping("/orderserved")
	@ApiOperation(value = "order that is served")
	public ResponseEntity<WashOrder> orderServed(@RequestBody WashOrder order) {
		 service.orderServed(order);
		 return new ResponseEntity("order served Successfully", HttpStatus.OK);


	}

	@PostMapping("/savingfeedback")
	@ApiOperation(value = "Saving feedback of the served washRequest")
	public ResponseEntity<WashOrder> savingFeedback(@RequestBody WashOrder order) {
		 service.savingfeedback(order);
		 return new ResponseEntity("saved feedback Successfully", HttpStatus.OK);

	}
	
	@GetMapping("/getorders")
	public List<WashOrder> getcustomer() {

		return service.getOrder();
	}
	@GetMapping("/getorderbystatus/{orderStatus}")
	public WashOrder getperticularuser(@PathVariable String orderStatus) {
		return service.getOrderbyStatus(orderStatus);
	}


}

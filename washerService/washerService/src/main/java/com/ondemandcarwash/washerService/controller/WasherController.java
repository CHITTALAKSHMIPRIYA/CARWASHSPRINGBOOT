package com.ondemandcarwash.washerService.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ondemandcarwash.washerService.config.LoginUtility;
import com.ondemandcarwash.washerService.model.WasherModel;
import com.ondemandcarwash.washerService.service.WasherService;
import com.ondemandcarwash.washerService.token.TokenGenerator;

@RestController
@RequestMapping("/washer")
public class WasherController {
	
	@Autowired
	private WasherService washerService;
	
	@Autowired
	private TokenGenerator token;
	//SendMail mailSender = new SendMail();
	private static final Logger logger = LoggerFactory.getLogger(WasherController.class);

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@PostMapping("/login/")
	@CrossOrigin(origins="http://localhost:4200")
	public ResponseEntity<WasherModel> loginUser(@RequestBody WasherModel user) {
		if (!washerService.verifyByuserName(user).get().getName().equals(user)) {
			String validToken = token.generator(user);
			logger.info("Your token: " + validToken);
			token.parseJWT(validToken);
			return new ResponseEntity("Welcome " + user.toString(), HttpStatus.OK);
		}
		return new ResponseEntity(new LoginUtility("Please register!!!Username doesn't exist"), HttpStatus.CONFLICT);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@PostMapping(value = "/register/")
	@CrossOrigin(origins="http://localhost:4200")
	public ResponseEntity<WasherModel> registerUser(@RequestBody WasherModel user) {
		if (!washerService.verifyEmail(user)) {
			String validToken = token.generator(user);
			logger.info("Your token: " + validToken);
			token.parseJWT(validToken);
			washerService.saveUser(user);
			return new ResponseEntity("Thanks for registring", HttpStatus.OK);
		}
		return new ResponseEntity(new LoginUtility("username already exists"), HttpStatus.CONFLICT);
	}

	@GetMapping("/getwasher")
	public List<WasherModel> getcustomer() {

		return washerService.getCustomer();
	}

	@GetMapping("/getperticularwasher/{id}")
	public WasherModel getperticularuser(@PathVariable String id) {
		return washerService.getSpecificCustomer(id);
	}

	
	
	@PostMapping("/editwasher")
	public ResponseEntity<String> updateuser(@RequestBody WasherModel c) {
		washerService.updateCustomer(c);
		 return new ResponseEntity<>("user updated Successfully", HttpStatus.OK);
	}

	

	@DeleteMapping("/deletewasher/{id}")
	public ResponseEntity<String> deleteuser(@PathVariable String id) {
		washerService.deleteuser(id);
		return new ResponseEntity<>("user deleted Successfully", HttpStatus.OK);
	}

	/*
	 * @PostMapping(value = "/forgot") public WasherModel
	 * forgotPassword(@RequestBody User user) { String from =
	 * "lakshmichitta96@gmail.com"; WasherModel u =
	 * washerService.getByEmail(user.getEmail()); logger.info("sending from " + from
	 * + " user " + u.toString()); String to = u.getEmailId();
	 * logger.info("email..." + to);
	 * 
	 * String subject = "Forgot Password"; String body = u.getPassword(); String
	 * password = "8142434441"; logger.info(from + " " + to + " " + subject + " " +
	 * body); mailSender.send(to, subject, body, from, password); return
	 * washerService.saveUser(user); }
	 */

}

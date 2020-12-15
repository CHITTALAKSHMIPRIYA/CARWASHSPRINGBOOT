package com.ondemandcarwash.washerService.service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ondemandcarwash.washerService.config.RestPreCondition;
import com.ondemandcarwash.washerService.config.TodoException;
import com.ondemandcarwash.washerService.model.WasherModel;
import com.ondemandcarwash.washerService.repository.IWasherDAO;

@Service
public class WasherService implements IWasherService {
	
	@Autowired
	private IWasherDAO washerRepo;
	
	/*
	 * public static final Logger LOG =
	 * LoggerFactory.getLogger(WasherService.class);
	 * 
	 * 
	 * public WasherModel login(WasherModel washer) { Optional<WasherModel>
	 * findExisted=washerRepo.findById(washer.getEmailId());
	 * if(findExisted.isPresent()) { WasherModel temp=findExisted.get();
	 * if(temp.getPassword().contentEquals(washer.getPassword())) { return temp; } }
	 * return null; } public WasherModel signup(WasherModel washer) {
	 * Optional<WasherModel> findExisted=washerRepo.findById(washer.getEmailId());
	 * if(findExisted.isPresent()) { return null; } else { return
	 * washerRepo.save(washer); }
	 * 
	 * }
	 * 
	 * 
	 * 
	 * public WasherModel updateProfile(WasherModel washer) { Optional<WasherModel>
	 * temp=washerRepo.findById(washer.getEmailId()); if(temp.isPresent()) { return
	 * washerRepo.save(washer);
	 * 
	 * } return null; }
	 * 
	 * public List<WasherModel> getAllWashers() { return washerRepo.findAll(); }
	 * 
	 * public WasherModel deleteWasher(WasherModel washer) { Optional<WasherModel>
	 * temp=washerRepo.findById(washer.getEmailId()); if(temp.isPresent())
	 * 
	 * { WasherModel existed=temp.get(); washerRepo.delete(existed); return existed;
	 * } return null;
	 * 
	 * }
	 * 
	 * 
	 */
	
	/**
	 * To verify userName exists in database or not
	 */

	@Override
	public Optional<WasherModel> verifyByuserName(WasherModel user) {
		return washerRepo.findById(user.getName());
	}

	/** To verify email exists in database or not */
	@Override
	public boolean verifyEmail(WasherModel user) {
		if (washerRepo.existsById(user.getName())) {
			return true;
		}
		return false;
	}

	/**
	 * To save user info in database
	 */
	@Override
	public WasherModel saveUser(WasherModel user) {
		return washerRepo.save(user);
	}

	public WasherModel getByEmail(String email) {
		// TODO Auto-generated method stub
		return washerRepo.findByEmailId(email);
	}
	
	
	public List<WasherModel> getCustomer()
	{
		return washerRepo.findAll();
		
	}
	
	public WasherModel getSpecificCustomer(String id)
	{
		List<WasherModel> customerRegisterModel=washerRepo.findAll();
		for(WasherModel crm :customerRegisterModel )
		{
			if(crm.getName().contentEquals(id))
			{
				return crm;
			}
		}
		return null;
	}
	
	
	public boolean deleteuser(String id) 
	{
		Optional<WasherModel> reg=washerRepo.findById(id);
		if(reg.isPresent()) 
		{
			washerRepo.deleteById(id);
			return true;
		}
		return false;
	}
	public WasherModel updateCustomer(WasherModel c)
	{
		List<WasherModel> all = washerRepo.findAll();
		for(WasherModel r: all) 
		{
			if(r.getName().contentEquals(c.getName()))
			{
				return washerRepo.save(c);
			}
		}
		return null;
	}

	
	
		
	
	

}

package com.ondemandcarwash.CustomerCarDetails.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ondemandcarwash.CustomerCarDetails.Model.PaymentModel;
import com.ondemandcarwash.CustomerCarDetails.Repository.IPaymentDAO;

@Service
public class PaymentService {
	@Autowired
	private IPaymentDAO payRepo;
	
	public List<PaymentModel> getallpayment()
	{
		return payRepo.findAll();
	}
	
	public List<PaymentModel> getpaymentbyuser(String user)
	{
		List<PaymentModel> all = payRepo.findAll();
		List<PaymentModel> pay = new ArrayList<PaymentModel>();
		for(PaymentModel l : all)
		{
			if(l.getUsername().contentEquals(user))
			{
				pay.add(l);
			}
		}
		return pay;
	}
	
	public PaymentModel getpaymentbyid(String id)
	{
		List<PaymentModel> all = payRepo.findAll();
		for(PaymentModel l : all)
		{
			if(l.getId().contentEquals(id))
			{
				return l;
			}
		}
		return null;
	}
	
	public PaymentModel addpayment(PaymentModel p) 
	{
		return payRepo.save(p);
	}
	
	public void deletecard(String id)
	{
		payRepo.deleteById(id);
	}
	
	public boolean updatepayment(PaymentModel pay)
	{
		Optional<PaymentModel> available = payRepo.findById(pay.getId());
		if(available.isPresent()) 
		{
			payRepo.save(pay);
			return true;
		}
		return false;
	}
}

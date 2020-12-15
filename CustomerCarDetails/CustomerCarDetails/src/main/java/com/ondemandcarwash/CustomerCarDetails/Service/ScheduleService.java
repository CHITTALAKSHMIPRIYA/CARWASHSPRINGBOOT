package com.ondemandcarwash.CustomerCarDetails.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ondemandcarwash.CustomerCarDetails.Model.ScheduleModel;
import com.ondemandcarwash.CustomerCarDetails.Repository.IScheduleDAO;

@Service
public class ScheduleService {
	@Autowired
	private IScheduleDAO scheduleRepo;
	
	public List<ScheduleModel> allshedule()
	{
		
		return scheduleRepo.findAll();
	}
	
	
	public ScheduleModel addshedule(ScheduleModel s)
	{
		return scheduleRepo.save(s);
	}
	
	
	
	public boolean deleteshedule(String id) 
	{
		Optional<ScheduleModel> sh= scheduleRepo.findById(id);
		if(sh.isPresent()) {
			scheduleRepo.deleteById(id);
			return true;
		}
		return false;
	}
}

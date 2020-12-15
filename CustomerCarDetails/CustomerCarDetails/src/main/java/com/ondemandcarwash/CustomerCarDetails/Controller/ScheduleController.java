package com.ondemandcarwash.CustomerCarDetails.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ondemandcarwash.CustomerCarDetails.Model.ScheduleModel;
import com.ondemandcarwash.CustomerCarDetails.Service.ScheduleService;

@RestController
@RequestMapping("/schedule")
public class ScheduleController {
  
	@Autowired
	private ScheduleService scheduleService;
	
	@GetMapping("/getshedule")
	public List<ScheduleModel> allshedule()
	{
		return scheduleService.allshedule();
	}
	
	@PostMapping("/addshedule")
	public ScheduleModel addshedule(@RequestBody ScheduleModel s)
	{
		return scheduleService.addshedule(s);
	}
	
	
	@DeleteMapping("/deleteshedule/{id}")
	public boolean deleteshedule(@PathVariable String id)
	{
		return scheduleService.deleteshedule(id);
	}
}

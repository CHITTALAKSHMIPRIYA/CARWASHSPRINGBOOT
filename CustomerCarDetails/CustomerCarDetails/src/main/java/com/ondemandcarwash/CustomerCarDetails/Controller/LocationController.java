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

import com.ondemandcarwash.CustomerCarDetails.Model.LocationModel;
import com.ondemandcarwash.CustomerCarDetails.Service.LocationService;

@RestController
@RequestMapping("/location")
public class LocationController {
	
	@Autowired
	private LocationService locServ;
	@GetMapping("/getalllocation")
	public List<LocationModel> getalllocation()
	{
		return locServ.getalllocation();
	}
	
	@GetMapping("/getbyuser/{user}")
	public List<LocationModel> getbyuser(@PathVariable String user)
	{
		return locServ.getbyuser(user);
	}
	
	@GetMapping("/getlocationbyid/{id}")
	public LocationModel getlocationbyid(@PathVariable String id)
	{
		return locServ.getlocationbyuser(id);
	}
	
	@PostMapping("/addlocations")
	public LocationModel addlocation(@RequestBody LocationModel loc)
	{
		return locServ.addlocation(loc);
	}
	
	@PostMapping("/editlocations")
	public LocationModel editlocation(@RequestBody LocationModel loc)
	{
		return locServ.editlocation(loc);
	}
	
	@DeleteMapping("/deletelocations/{id}")
	public boolean deletelocation(@PathVariable String id)
	{
		return locServ.deletelocation(id);
	}

}

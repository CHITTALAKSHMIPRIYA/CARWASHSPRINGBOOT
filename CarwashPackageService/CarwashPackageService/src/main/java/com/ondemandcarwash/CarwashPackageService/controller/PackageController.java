package com.ondemandcarwash.CarwashPackageService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ondemandcarwash.CarwashPackageService.model.PackageModel;
import com.ondemandcarwash.CarwashPackageService.service.PackageService;

@RestController
@RequestMapping("/packages")
public class PackageController {
	
	@Autowired
	private PackageService packService;

	
	@GetMapping("/allPackages")
	//@ApiOperation(value = "All carWash Packages")
	public List<PackageModel> getAllPackages(){
		return packService.getAllPackages();
	}
	
	@PostMapping("/savePackage")
	//@ApiOperation(value = "Save carWash Package")
	public PackageModel savePackage(@RequestBody PackageModel pack) {
		System.out.println("Package successfully changed");
		return packService.savePackage(pack);
	}
	
	@PostMapping("/deletePackage")
	//@ApiOperation(value = "Admin delete's carWash Package")
	public boolean deletePackage(@RequestBody PackageModel pack) {
		return packService.deletePackage(pack);
	}
}

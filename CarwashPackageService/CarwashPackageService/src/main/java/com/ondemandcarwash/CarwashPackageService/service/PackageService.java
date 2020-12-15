package com.ondemandcarwash.CarwashPackageService.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ondemandcarwash.CarwashPackageService.model.PackageModel;
import com.ondemandcarwash.CarwashPackageService.repo.IPackageDAO;

@Service
public class PackageService {
	
	@Autowired
	private IPackageDAO packRepo;
     
	
	public List<PackageModel> getAllPackages(){
		return packRepo.findAll();
	}
	
	public PackageModel savePackage(PackageModel pack) {
		return packRepo.save(pack);
	}
	
	public boolean deletePackage(PackageModel pack) {
		Optional<PackageModel> existed=packRepo.findById(pack.getPackageID());
		if(existed.isPresent()) {
			packRepo.deleteById(pack.getPackageID());
			return true;
		}
		return false;
		
	}
}

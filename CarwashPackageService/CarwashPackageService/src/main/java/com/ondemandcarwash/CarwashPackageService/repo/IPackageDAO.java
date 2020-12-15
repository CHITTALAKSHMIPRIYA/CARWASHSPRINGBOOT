package com.ondemandcarwash.CarwashPackageService.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ondemandcarwash.CarwashPackageService.model.PackageModel;


@Repository
public interface IPackageDAO extends MongoRepository<PackageModel, String> {

}

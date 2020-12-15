package com.ondemandcarwash.washerService.service;

import java.util.Optional;

import com.ondemandcarwash.washerService.model.WasherModel;

public interface IWasherService {
	public boolean verifyEmail(WasherModel washer);
	//public WasherModel verifyByEmailId(String emailId);
    public WasherModel saveUser(WasherModel washer);
    Optional<WasherModel> verifyByuserName(WasherModel washer);

}

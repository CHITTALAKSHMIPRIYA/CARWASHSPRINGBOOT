package com.ondemandcarwash.washerService.config;

import java.util.Optional;

import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component
public class RestPreCondition {
	 private RestPreCondition() {
	    }
	 public static  <T> Optional<T> checkArgument(Optional<T> checkArgument,String errorMessage) throws TodoException {
	        if (!checkArgument.isPresent()) {
	            throw new TodoException(String.valueOf(errorMessage));
	        }
	        return checkArgument;
	    }
	 /**
	 * @param reference
	 * @param errorMessage
	 * @return
	 * @throws TodoException
	 */
	public  <T> T checkNotNull(T reference, @Nullable Object errorMessage) throws TodoException {
	        if (reference == null||reference=="") {
	            throw new TodoException(String.valueOf(errorMessage));
	        }
	        return reference;
	    }
	/**
	 * @param checkArgument
	 * @param errorMessage
	 * @return
	 * @throws TodoException
	 */
	public  <T> boolean checkArgument(boolean checkArgument, @Nullable Object errorMessage) throws TodoException {
     if (!checkArgument) {
         throw new TodoException(String.valueOf(errorMessage));
     }
     return checkArgument;

	}

}

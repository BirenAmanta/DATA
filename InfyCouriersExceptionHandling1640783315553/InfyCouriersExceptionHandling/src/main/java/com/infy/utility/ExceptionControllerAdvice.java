package com.infy.utility;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;

import org.springframework.http.ResponseEntity;




import com.infy.exception.InfyCourierException;
import com.infy.utility.ErrorInfo;


public class ExceptionControllerAdvice {
	
	 private static final Log LOGGER = LogFactory.getLog(ExceptionControllerAdvice.class);


	@Autowired
	private Environment environment;
	
	
	public ResponseEntity<ErrorInfo> exceptionHandler(Exception exception) {
		return null;
	}
	
	
	
	public ResponseEntity<ErrorInfo> infyCourierExceptionHandler(InfyCourierException exception) {

		return null;
	}	
		


}

package com.coforge.training.producthive.exception;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import ch.qos.logback.classic.Logger;
/**
 * Author   : Shradhey.Naudiyal
 * Date     : Oct 1, 2025
 * Time     : 11:48:24 AM
 * Project  : pms-restapi
 */
/*Global exception Handler class to manage Custom Exceptions.
 * This approach allows you to remove the exception handling 
 * logic from your controller method.
 * 
 * The @ControllerAdvice annotation makes this class a global exception handler.
 * The @ExceptionHandler annotation specifies that the handleResourceNotFoundException method 
 * should be invoked when a ResourceNotFoundException is thrown.
 * The method returns a ResponseEntity with an appropriate status code (404 Not Found).
 */

//Class to handle exceptions globally

@ControllerAdvice
public class GlobalExceptionHandler {
	//private static final Logger logger= LoggerFactory.getLogger(GlobalExceptionHandler.class);

	@ExceptionHandler(ResourceNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public ResponseEntity<String> handleResourceNotFoundException(ResourceNotFoundException ex) {

		return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
	}

}

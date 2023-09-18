package com.tbonegames.exception;

public class ProductNotFoundException extends Exception{
	String exceptionMessage = "The product was not found within the system";
	public ProductNotFoundException(String message) {
		super(message);
		
	}
}

package com.udemy.cursomc.services.exception;

public class ObjectNotFoundException extends RumtimeException {
	
	private static final long serialVersionUID = 1L;
	
	public ObjectNotFoundException(String msg) {
		
		super(msg);
		
	}
	
	public ObjectNotFoundException(String msg, Throwable cause) {
		
		super(msg, cause);
		
	}

}

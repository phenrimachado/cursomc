package com.basis.cursomc.services.exceptions;

public class EmptyResultDataException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;
	
	public EmptyResultDataException(String msg) {
		super(msg);
	}
	
	public EmptyResultDataException(String msg, Throwable cause) {
		super(msg, cause);
	}
}

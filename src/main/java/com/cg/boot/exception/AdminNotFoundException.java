package com.cg.boot.exception;

public class AdminNotFoundException extends RuntimeException {

	public AdminNotFoundException() {

	}

	public AdminNotFoundException(String msg) {
		super(msg);
	}

}

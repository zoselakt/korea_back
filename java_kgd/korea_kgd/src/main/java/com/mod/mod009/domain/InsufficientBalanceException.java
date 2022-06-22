package com.mod.mod009.domain;

public class InsufficientBalanceException extends RuntimeException{
	public InsufficientBalanceException(String msg) {
		super(msg);
	}
}

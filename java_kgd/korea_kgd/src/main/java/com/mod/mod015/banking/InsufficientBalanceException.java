package com.mod.mod015.banking;

public class InsufficientBalanceException extends RuntimeException {
	// if문에 해당되면 runtimeException을 발생시키는 클래스, 생성자
	public InsufficientBalanceException(String msg) {
		super(msg);
	}
}

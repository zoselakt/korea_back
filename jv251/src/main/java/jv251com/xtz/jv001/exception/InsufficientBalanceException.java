package jv251com.xtz.jv001.exception;

public class InsufficientBalanceException extends RuntimeException {
	// if문에 해당되면 runtimeException을 발생시키는 클래스, 생성자
	private double balance;
	public InsufficientBalanceException(String msg) {
		super(msg);
	}
	
	public InsufficientBalanceException(String msg,double balance) {
		super(msg);
		this.balance = balance;
	}
	
	@Override
	public String getMessage() {
		return super.getMessage() + "현재 잔고는 " + balance + " 입니다.";
	}
}

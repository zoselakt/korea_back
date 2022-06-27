package jv251com.xtz.jv001.exception;

@SuppressWarnings("serial")
public class OverdraftException extends InsufficientBalanceException {
	//대출시 발생하는 메세지
	private double overdraftAvail;
	
	public OverdraftException(String msg, double balance, double overdraftAvail) {
		super(msg, balance);
		this.overdraftAvail = overdraftAvail;
	}
	@Override
	public String getMessage() {
		return super.getMessage() + "현재 대출가능금은 " + overdraftAvail + " 입니다.";
	}
}

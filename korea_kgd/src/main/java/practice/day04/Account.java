package practice.day04;

public class Account {
	public static final int MIN_BALANCE = 0;
	public static final int MAX_BALANCE = 1000000;
	
	private int balance;
	
	
	public int getBalance() { //값을 바로 리턴
		return balance;
	}
	public void setBalance(int balance) { // 유효성검사등 값을 보내기 위함
		if(balance < Account.MIN_BALANCE || balance > Account.MAX_BALANCE) {
			return;
		}
		this.balance = balance;
	}
	
}

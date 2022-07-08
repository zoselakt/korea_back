package practice.day13;

public class MyAccount {
	private String accountId;
	private int pwd;
	private String name;
	private int balance = 0;
	
	public MyAccount(String accountId, int pwd, String name, int balance) {
		super();
		this.accountId = accountId;
		this.pwd = pwd;
		this.name = name;
		this.balance = balance;
	}

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public int getPwd() {
		return pwd;
	}

	public void setPwd(int pwd) {
		this.pwd = pwd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "MyAccount [accountId=" + accountId + ", pwd=" + pwd + ", name=" + name + ", balance=" + balance + "]";
	}
}

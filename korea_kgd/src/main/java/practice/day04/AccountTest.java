package practice.day04;

public class AccountTest {
	/**
	 * 은행계좌 객체인 Account 객체는 잔고(Balance) 필드를 가지고 있다.
	 * Balance필드는 음수값이 될 수 없고, 최대 백만원까지만 저장할 수 있다.
	 * 외부에서 Balance필드를 마음대로 변경하지 못하도록 하고 100만의 범위의 값만 가질수 있도록 
	 * Account 클래스를 작성하라.
	 * 
	 * 1. getter / setter 이용
	 * 2. 상수를이용하여 0과 100만을 선언
	 * 3. setter의 매개값이 음수이거나 백만원을 초과하면 현재 balance값을 유지.
	 * 
	 */

	public static void main(String[] args) {
		Account account = new Account();
		
		account.setBalance(10000);
		System.out.println("현재잔고: " + account.getBalance());
		
		account.setBalance(-100); //음수가 들어오면 return되어 실행되어지지않음.
		System.out.println("현재잔고: " + account.getBalance());
		
		account.setBalance(200000000);
		System.out.println("현재잔고: " + account.getBalance());

	}
}

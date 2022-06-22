package algorithm.level3.bank;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("------------------------------------------");
			System.out.println("1. 계좌생성 | 2. 계좌 목록 | 3.예금  | 4.출금 | 5. 종료 ");
			System.out.println("------------------------------------------");
			System.out.println("원하는 숫자를 입력하세요: ");
			
			int selectNo = scanner.nextInt();
			
			if(selectNo == 1) {
				createAccount();
			}else if(selectNo == 2) {
				accountList();
			}else if(selectNo == 3) {
				deposit();
			}else if(selectNo == 4) {
				withdraw();
			}else if(selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}

	private static void createAccount() {
		System.out.println("--00 은행 계좌 개설--");
		System.out.println("계좌번호: ");
		String ano = scanner.next();
		
		System.out.println("계좌주: ");
		String owner = scanner.next();
		
		System.out.println("초기입금액: ");
		int balance = scanner.nextInt();
		
		Account newAccount = new Account(ano, owner, balance);
		for(int i=0; i<accountArray.length; i++) {
			accountArray[i] = newAccount;
			System.out.println("계좌가 생성되었습니다.");
			break;
		}
	}
	private static void accountList() {
		System.out.println("계좌목록 검색입니다."+ "\n");
		for(int i=0; i<accountArray.length; i++) {
			Account account = accountArray[i];
			if(account != null) {
				System.out.println("계좌번호: " + account.getAno());
				System.out.println("계좌주: " + account.getOwner());
				System.out.println("잔액: " + account.getBalance());
			}
		}
	}
	private static void deposit() {
		System.out.println("예금 입금 서비스 \n");
		System.out.println("계좌번호 : ");
		String ano = scanner.next();
		System.out.println("예금액 : ");
		int money = scanner.nextInt();
		
		Account account = findAccount(ano);
		//ano에 해당하는 계좌를 못찾았다면..
		if(account == null) {
			System.out.println("계좌가 존재하지 않습니다.");
			return;
		}
		account.setBalance(account.getBalance() + money);
		System.out.println("입금 완료되었습니다. 잔액: " + account.getBalance());
	}
	private static void withdraw() {
		System.out.println("예금 입금 서비스 \n");
		System.out.println("계좌번호 : ");
		String ano = scanner.next();
		System.out.println("예금액 : ");
		int money = scanner.nextInt();
		 
		Account account = findAccount(ano);
		//ano에 해당하는 계좌를 못찾았다면..
		if(account == null) {
			System.out.println("계좌가 존재하지 않습니다.");
			return;
		}
		account.setBalance(account.getBalance() - money);
		System.out.println("출금 완료되었습니다. 잔액: " + account.getBalance());
	}
	public static Account findAccount(String ano) {
		Account account = null;
		for(int i=0; i<accountArray.length; i++) {
			if(accountArray[i] != null) {
				String dbAno = accountArray[i].getAno();
				if(dbAno.equalsIgnoreCase(ano)) {
					account = accountArray[i];
					break;
				}
			}
		}
		return account;
	}
}

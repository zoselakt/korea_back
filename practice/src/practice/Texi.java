package practice;

public class Texi {
	int taxiNumber;
	int passengerNumber;
	int money;
	
	public Texi(int taxiNumber) {
		this.taxiNumber = taxiNumber;
	}
	public void take(int money) {
		this.money = money;
		passengerNumber++;
	}
	
	public void showInfo() {
		System.out.println("�ý� �°� �� �ο����� : " +passengerNumber+"���̰�, ������: " + money +"�Դϴ�.");
	}
}

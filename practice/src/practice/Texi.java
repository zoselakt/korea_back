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
		System.out.println("택시 승객 총 인원수는 : " +passengerNumber+"명이고, 수입은: " + money +"입니다.");
	}
}

package practice;

public class Subway {
	int passengerNumber;
	int subwayNumber;
	int money;
	
	public Subway(int passengerNumber) {
		this.passengerNumber = passengerNumber;
	}
	
	public void take(int money) {
		this.money = money;
		subwayNumber++;
	}
	public void showInfo() {
		System.out.println("지하철 승객 수는: " + subwayNumber + "명이고, 수입은: "+ money + " 입니다");
	}
}

package practice.day03;

public class Taxi {
	// 택시번호, 승객수, 수입을 가지는 변수를 생성한다.
	int taxiNumber;
	int passengerCount;
	int money;
	
	//매개변수로 택시 변수를 받는 생성자생성
	public Taxi(int taxiNumber) {
		this.taxiNumber = taxiNumber;
	}
	// 승객이 탄다면 요금을 받는 메소드 생성
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	//택시 현재 정보출력
	public void showInfo() {
		System.out.println(taxiNumber + "번 택시의 승객은: " + passengerCount + "명이고, 수입은: " + money +"원입니다.");
	}

}

package practice.day03;

public class Bus {
	//버스 클래스는 "버스번호", "승객수", "버스 수입"을 멤버 변수로 가진다.
	int busNumber;
	int passengerCount;
	int money;
	
	//"승객이 버스에 탄 경우", "버스의 현재 정보를 보여준다"를 메서드로 가진다.
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	//학생 한명이 버스에 탄다면 버스 요금을 1000원 받고 승객 수가 한 명 증가한다.
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	//버스의 정보출력
	public void showInfo() {
		System.out.println("버스 "+ busNumber +"번 버스의 승객은: " + passengerCount+ "명이고, 수입은: "+ money +"입니다.");
	}
}

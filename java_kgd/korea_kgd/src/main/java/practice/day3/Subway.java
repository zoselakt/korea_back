package practice.day3;

public class Subway {
	// 지하철의 라인넘버, 승객수, 결재금액을 출려할 변수를 생성한다.
	String lineNumber;
	int passengerCount;
	int money;
	
	// 지하철을 탓을 경우의 메소드 생성
	public Subway(String lineNumber) {
		this.lineNumber = lineNumber;
	}
	public void take(int money) {
		this.money = money;
		passengerCount++;
	}
	public void showInfo() {
		System.out.println(lineNumber+"의 승객은: " + passengerCount + "명이고, 수입은: " + money +"입니다.");
	}
}


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
		System.out.println("����ö �°� ����: " + subwayNumber + "���̰�, ������: "+ money + " �Դϴ�");
	}
}

package practice;

public class Bus{
	int passengerNum;
	int busNumber;
	int money;
	
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	public void take(int money) {
		this.money = money;
		passengerNum++;
	}
	public void showInfo() {
		System.out.println(busNumber + "�� �� �°� ����: " + passengerNum + "�̰�, ������: " + money +"�Դϴ�." );
	}
}

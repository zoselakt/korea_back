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
		System.out.println(busNumber + "ÀÇ ÃÑ ½Â°´ ¼ö´Â: " + passengerNum + "ÀÌ°í, ¼öÀÔÀº: " + money +"ÀÔ´Ï´Ù." );
	}
}

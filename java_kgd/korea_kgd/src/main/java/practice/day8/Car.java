package practice.day8;

public class Car {
	Tire frontLeftTire = new Tire("전방 좌측", 6);
	Tire frontRightTire = new Tire("전방 우측", 2);
	Tire backLeftTire = new Tire("후방 좌측", 3);
	Tire backRightTire = new Tire("후방 우측", 4);
	
	int run() {
		System.out.println("[자동차가 운행중입니다]");
		if(frontLeftTire.roll() == false) {
			stop();
			return 1;
		}
		if(frontRightTire.roll() == false) {
			stop();
			return 2;
		}
		if(backLeftTire.roll() == false) {
			stop();
			return 3;
		}
		if(backRightTire.roll() == false) {
			stop();
			return 4;
		}
		return 0;
	}
	void stop() {
		System.out.println("[자동차가 멈춥니다.]");
	}
}

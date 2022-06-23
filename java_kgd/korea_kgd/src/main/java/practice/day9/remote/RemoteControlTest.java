package practice.day09.remote;

public class RemoteControlTest {
	public static void main(String[] args) {
		//인터페이스 변수 선언
		RemoteControl rc = null;
		
		//Television 객체를 인터페이스 타입에 대입
		rc = new Television();
		rc.turnOn();
		rc.turnOff();
		rc.setMute(true);
		
		//Audio 객체를 인터페이스 타입에 대입
		rc = new Audio();
		rc.turnOn();
		rc.turnOff();
		rc.setMute(true);
	}
}

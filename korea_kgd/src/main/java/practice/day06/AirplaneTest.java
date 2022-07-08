package practice.day06;

public class AirplaneTest {
	public static void main(String[] args) {
		AirplaneSuper aps = new AirplaneSuper();
		aps.takeOff();
		aps.fly();
		aps.flyMode = AirplaneSuper.SUPERSONIC;
		aps.fly();
		aps.flyMode = AirplaneSuper.NORMAL;
		aps.fly();
		aps.land();
	}
}

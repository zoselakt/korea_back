package practice.test.test1;

public class FlyerTest {
	public static void main(String[] args) {
		Flyer bird = new Bird();
		bird.fly();
		bird.flying();
		bird.landing();
		bird.land();
		System.out.println();
		Flyer airplane = new Airplane();
		airplane.fly();
		airplane.flying();
		airplane.landing();
		airplane.land();
	}
}

package practice.day7;

public class CarTest {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.setGas(5); // setGas호출
		boolean gasState = myCar.isLeftGas(); // isLeftGas메서드호출
		if(gasState) {
			System.out.println("출발합니다");
			myCar.run();
		}else {
			System.out.println("gas를 주입하세요");
		}
	}
}

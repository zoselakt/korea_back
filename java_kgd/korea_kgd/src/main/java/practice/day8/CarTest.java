package practice.day8;

public class CarTest {
	public static void main(String[] args) {
		Car car = new Car();
		
		for(int i=0; i<=5; i++) {
			int problemLocation = car.run();
			
			switch (problemLocation) {
			case 1:
				System.out.println("전방 좌측 HankookTire로 교체");
				car.frontLeftTire = new HankookTire("전방 좌측", 15);
				break;
			case 2:
				System.out.println("전방 우측 HankookTire로 교체");
				car.frontLeftTire = new HankookTire("전방 우측", 13);
				break;
			case 3:
				System.out.println("후방 좌측 HankookTire로 교체");
				car.frontLeftTire = new HankookTire("후방 좌측", 14);
				break;
			case 4:
				System.out.println("후방 우측 HankookTire로 교체");
				car.frontLeftTire = new HankookTire("후방 우측", 17);
				break;
			}
			System.out.println("=============================");
		}
	}
}

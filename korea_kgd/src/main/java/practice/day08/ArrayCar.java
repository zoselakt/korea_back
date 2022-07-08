package practice.day08;
/**
 * 
 * @author ksd49
 * 
 * Car 클래스를 Array로 관리하여 리팩토링한 내용
 */
public class ArrayCar {
	Tire[] tires = {
			new Tire("전방좌측", 6),
			new Tire("전방우측", 2),
			new Tire("후방좌측", 3),
			new Tire("후방우측", 4)
	};
	int run() {
		System.out.println("자동차가 달립니다.");
		for(int i=0; i<tires.length; i++) {
			if(tires[i].roll() == false) {
				stop();
				return (i+1);
			}
		}
		return 0;
	}
	void stop() {
		System.out.println("자동차가 멈춥니다.");
	}
}

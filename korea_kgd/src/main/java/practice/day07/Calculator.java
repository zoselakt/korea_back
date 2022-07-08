package practice.day07;

public class Calculator {
	//메소드
	void powerOn() {
		System.out.println("전원을 킵니다.");
	}
	int plus(int x,int y) {
		int result = x + y;
		return result;
	}
	double divide(int x, int y) {
		double result = (double)x / (double)y;
		return result;
	}
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	//=====================================
	int sum1(int ... values) {
		int sum = 0;
		for(int i=0; i<values.length; i++) {
			sum += values[i];
		}
		return sum;
	};
	
	int sum2(int ... values) {
		int sum =0;
		for(int i=0; i<values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
}

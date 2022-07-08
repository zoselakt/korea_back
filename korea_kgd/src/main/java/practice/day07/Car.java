package practice.day07;

public class Car {
	int gas;
	void setGas(int gas) {
		this.gas = gas;
	}
	boolean isLeftGas() {
		if(gas == 0) {
			System.out.println("No Gas");
			return false;
		}
		System.out.println("Yes Gas");
		return true;
	}
	void run() {
		while(true) {
			if(gas > 0) {
				System.out.println("달립니다. (gas잔량: "+ gas + ")");
				gas -= 1;
			}else {
				System.out.println("멈춥니다. (gas잔량: " + gas + ")");
				return;
			}
		}
	}
}

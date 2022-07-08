package practice.day03;

public class Student {
	// 학생이름과 현재금액을 받는 변수를 만든다.
	public String studentName;
	public int money;
	
	 // 매개변수로 학생이름, 가진 돈을 받는 생성자
	public Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}
	// 버스를 탓을경우의 메소드를 생성
	public void takeBus(Bus bus) {
		bus.take(1000);
		this.money -= 1000;
	}
	// 지하철를 탓을경우의 메소드를 생성
	public void takeSubway(Subway subway) {
		subway.take(1500);
		this.money -= 1500;
	}
	// 택시를 탓을경우의 메소드를 생성
	public void takeTaxi(Taxi taxi) {
		taxi.take(10000);
		this.money -= 10000;
	}
	// 학생의 가진돈을 출력하는 메소드를 생성
	public void showInfo() {
		System.out.println(studentName +  "님의 잔돈은 " + money + " 입니다.");
	}
	
	
}

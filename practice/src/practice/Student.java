package practice;

public class Student {
	public String studentName;
	public int money;
	
	public Student(String studentName, int money) {
		super();
		this.studentName = studentName;
		this.money = money;
	}
	
	public void takeBus(Bus bus) {
		bus.take(1000);
		this.money -= 1000;
	}
	
	public void takeSubway(Subway subway) {
		subway.take(1500);
		this.money -= 1500;
	}
	public void takeTaxi(Texi texi) {
		texi.take(10000);
		this.money -= 10000;
	}
	
	public void showInfo() {
		System.out.println(studentName + "학생이 가진 돈은 " + money + "입니다.");
	}
}
package practice;

public class StudentTest {
	public static void main(String[] args) {
		Student james = new Student("james", 5000);
		Student tomas = new Student("Tomas", 10000);
		Student edward = new Student("edward", 20000);
		
		Bus bus = new Bus(100);
		james.takeBus(bus);
		james.showInfo();
		bus.take(1000);
		System.out.println();
		
		Subway subway = new Subway(1);
		tomas.takeSubway(subway);
		tomas.showInfo();
		System.out.println();
		
		Texi texi = new Texi(1541);
		edward.takeTaxi(texi);
		edward.showInfo();
	}
}

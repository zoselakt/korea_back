package practice.day03;

public class TakeVihicleTest {

	public static void main(String[] args) {
		Student james = new Student("james", 5000);
		Student Tomas = new Student("Tomas", 10000);
		Student Edward = new Student("Edward", 20000);
		
		Bus bus = new Bus(100);
		james.takeBus(bus);
		james.showInfo();
		System.out.println();
		
		Subway subway = new Subway("2호선");
		Tomas.takeSubway(subway);
		Tomas.takeBus(bus);
		Tomas.showInfo();
		System.out.println();
		
		Taxi taxi = new Taxi(1234);
		Edward.takeTaxi(taxi);
		Edward.showInfo();
		System.out.println();
		
		bus.showInfo();
		subway.showInfo();
		taxi.showInfo();
	}

}

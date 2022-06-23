package practice.day10;

public class ArrayTest {
	public static void main(String[] args) {
		Employee[] emp = new Employee[5];
		Employee[] manager = new Employee[5];
		
		emp[0] = new Employee("유비", 33);
		emp[1] = new Employee("관우", 23);
		emp[2] = new Employee("장비", 35);
		emp[3] = new Employee("여포", 35);
		emp[4] = new Employee("조조", 36);
		
		for(int i=0; i<emp.length; i++) {
			manager[i] = new Employee();
			manager[i].setAge(emp[i].getAge());
			manager[i].setName(emp[i].getName());
		}
		
		manager[0].setName("손책");
		manager[1].setName("손권");
		
		for(int i=0; i<emp.length; i++) {
			System.out.println(emp[i].getName());
		}
		System.out.println();
		for(int i=0; i<manager.length; i++) {
			System.out.println(manager[i].getName());
		}
	}
}

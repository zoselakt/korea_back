package practice.test.test2;

public class AnimalTest {
	public static void main(String[] args) {
		Animal cat = new Cat();
		cat.getUp();
		cat.work();
		cat.eat();
		cat.ignore();
		System.out.println();
		
		Animal dog = new Dog();
		dog.getUp();
		dog.work();
		dog.eat();
		dog.ignore();
	}
}

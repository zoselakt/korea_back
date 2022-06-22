package practice.day2;

public class People {
	// 객체의 맞는(나이 이름 결혼여부 자녀 수) 변수를 만든다. 
	public int age;
	public String name;
	public boolean isMarried;
	public int children;
	
	//출력만 있는 메소드를 작성한다.
	public void peopleinfo() {
		System.out.println("나이: " +age);
		System.out.println("이름: " +name);
		System.out.println("결혼 여부: " +isMarried);
		System.out.println("자녀 수: " +children);
	}
}

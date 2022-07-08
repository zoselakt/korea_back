package practice.day04;

public class Member {
	private String name;
	private String id;
	private String password;
	private int age;
	
	public Member(String name, String id, String password, int age) {
		super();
		this.name = name;
		this.id = id;
		this.password = password;
		this.age = age;
	}
	
	
	public static void main(String[] args) {
		Member user1 = new Member("홍길동", "hong12", "1234", 22);
		Member user2 = new Member("김길동", "kimhong34", "1111", 23);
		
		System.out.println(user1.age);
	}
}

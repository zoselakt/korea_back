package com.singleton.day01;

/**
 * 
 * @author ksd49
① private 생성자
② static 변수로 객체 생성
③ 객체의 getter 구현
클래스를 위와 같이 설계하면 인스턴스의 유일성이 보장됩니다.
 */

public class User {
	// 싱글톤 변수를 만든다. 
	private static Long serialNumber = 1000L;
	private Long userId;
	private String userName;
	
	// 생성자를 만들고 내부에 SerialNumber를 1씩증가하는 코드를 추가한다.
	public User(String userName) {
		this.userName = userName;
		serialNumber++;
		this.userId = serialNumber;
	}
	
	// 개터를 생성한다.
	public static Long getSerialNumber() {
		return serialNumber;
	}
	
	// 오버라이딩 코드추가
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + "]";
	}
	
	
	//각 학생의 serialNumber를 출력한다.
	public static void main(String[] args) {
		System.out.println(User.getSerialNumber());
		User user1 = new User("학생1");
		System.out.println(User.getSerialNumber());
		User user2 = new User("학생2");
		System.out.println(User.getSerialNumber());
		User user3 = new User("학생3");
		System.out.println(User.getSerialNumber());
		User user4 = new User("학생4");
		
	}
	
}

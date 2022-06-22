package practice.day2;

/**
 * 
 * @author Administrator
Q1.다음 객체에 대한 설명에 맞는 클래스를 만들고 값을 출력해 보세요.
나이가30살, 이름이 James라는 남자가 있습니다. 이 남자는 결혼을 했고 자식이 셋 있습니다.
 *
 */
public class PeopleTest {
	public static void main(String[] args) {
		// 객체를 만든다.
		People people = new People();
		
		//각각의 속성을 적는다.
		people.age = 40;
		people.name = "james";
		people.isMarried = true;
		people.children = 3;
		
		//실행
		people.peopleinfo();
	}
}

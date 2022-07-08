package practice.day12;

/**
 * 
 * @author ksd49
 * 학생의 이름,반,번호,과목별 성적 변수를 만들고 info메서드를 정의하라
 *
 */
public class Exercise6_5 {
	public static void main(String[] args) {
		Student student = new Student("홍길동", 1, 1, 100, 60, 76);
		
		System.out.println(student.info());
	}
}
class Student{
	String name;
	int graduate;
	int classNum;
	int korean;
	int english;
	int math;
	
	public Student(String name, int graduate, int classNum, int korean, int english, int math) {
		super();
		this.name = name;
		this.graduate = graduate;
		this.classNum = classNum;
		this.korean = korean;
		this.english = english;
		this.math = math;
	}

	 String info() {
		 int sum = korean + english + math;
		 int aver = (korean + english + math) / 3; 
		return name +","+ graduate +","+ classNum +","+ korean +","+ english +","+ math +","+ sum +","+ aver;
	}
}
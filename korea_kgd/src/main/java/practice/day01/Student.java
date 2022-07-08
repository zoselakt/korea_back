package practice.day01;

public class Student {
	// 4개의 변수를 생성한다.
	private String studentID;
	private String studentName;
	private String studentGender;
	private double studentCredit;
	
	//개터 새터 생성
	public String getStudentID() {
		return studentID;
	}
	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentGender() {
		return studentGender;
	}
	public void setStudentGender(String studentGender) {
		this.studentGender = studentGender;
	}
	public double getStudentCredit() {
		return studentCredit;
	}
	public void setStudentCredit(double studentCredit) {
		this.studentCredit = studentCredit;
	}
	
	//초기화를 위한 생성자
	public Student(String studentID, String studentName, String studentGender, double studentCredit) {
		super();
		this.studentID = studentID;
		this.studentName = studentName;
		this.studentGender = studentGender;
		this.studentCredit = studentCredit;
	}
	
	// 학생정보출력
	public void show() {
		System.out.println("학생 번호: "+getStudentID());
		System.out.println("학생 이름: "+getStudentName());
		System.out.println("학생 성별: "+getStudentGender());
		System.out.println("학생 학점: "+getStudentCredit());
	}
	
}

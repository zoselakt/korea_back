package practice.day1;

import java.util.Random;
/**
 * 
 * @author Administrator
 * 참고블로그: https://m.blog.naver.com/PostView.naver?isHttpsRedirect=true&blogId=ndb796&logNo=221201655333
 */
public class StudentTest {

	public static void main(String[] args) {
		//1차원 배열에 담는 객체생성
		Student[] stu = new Student[5];
		
		// 반복문을 이용하여 학생 정보 생성
		for(int i=0; i<stu.length; i++) {
			stu[i] = new Student("00" + i, "홍길동"+i, "남자", (double) ((int)(new Random().nextDouble() * 4.5 * 100)) / 100);
		}
		
		//반복문을 이용하여 학생정보 출력
		for(int i=0; i<stu.length; i++) {
			System.out.println("==============================");
			stu[i].show();
		}
	}
}

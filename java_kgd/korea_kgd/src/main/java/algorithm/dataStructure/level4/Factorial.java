package algorithm.dataStructure.level4;

import java.util.Scanner;
/**
 * 
 * @author Administrator
 * 팩토리얼 구하기
 * 팩토리얼(계승)값을 재귀적으로 구함
 */
public class Factorial {
	//음이 아닌 정수 n의 팩토리얼 값을 반환
	//매개변수 n에 전달받은 값이 0보다 클떄 n에 factorial(n-1)의 값을 리턴 / 0보다 작을때 1을 리턴하는 로직
	static int factorial(int n) {
		if(n > 0) {
			return n * factorial(n-1);
		}else {
			return 1;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요: ");
		int x = sc.nextInt();
		System.out.println(x+"의 팩토리얼은 " + factorial(x) + "입니다.");
	}
}
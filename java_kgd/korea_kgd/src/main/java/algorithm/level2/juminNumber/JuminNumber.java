package algorithm.level2.juminNumber;

import java.util.Scanner;

public class JuminNumber {
	public static void main(String[] args) {
		// 입력한 값을 출력하는 Scanner를 입력한다.
		Scanner sc = new Scanner(System.in);
		System.out.println("주민등록번호 13자리를 '-'없이 입력하세요");
		String juminNo = sc.nextLine();
		
		// 입력한값을 비교할 값을 입력한다.
		String check = "234567892345";
		
		int sum = 0;
		// 반복문을 사용하여 주민번호값을 비교하는 로직을 작성한다.
		for(int i=0; i<12; i++) {
			sum += (juminNo.charAt(i) - 48) * (i < 8 ? i+2 : i-6);
		}
		
		//비교하는로직과 결과를 최종비교하는 로직을 작성한다. 
		int result = (11 - sum % 11) %10;
		if(result == juminNo.charAt(12) - 48) {
			System.out.println("정상");
		} else {
			System.out.println("오류");
		}
	}
}

package algorithm.dataStructure.level1;

import java.util.Scanner;

/**
 * 
 * @author ksd49
 * 양수만 입력받아 1부터 n까지의 합 구하기
 * 음수의 값을 입력받으면 무효처리
 */
public class SumFor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		do {
			System.out.println("n의 값: ");
			n = sc.nextInt();
		}while(n <= 0);
		
		int sum =0;
		for(int i=0; i <= n; i++) {
			sum += i; 
		}
		System.out.println("1부터 "+ n + "까지의 합은: " +sum +"입니다.");
		
	}
}

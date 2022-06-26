package algorithm.dataStructure.level1;

import java.util.Scanner;
/**
 * 
 * @author ksd49
 * 왼쪽아래가 이등변 삼각형인 프로그램
 */

public class Triangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		do {
			System.out.print("단 수를 입력합니다: ");
			n = sc.nextInt();
		}while(n <= 0);
		
//		for(int i=1; i<=n; i++) {
//			for(int j=1; j<=i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		triangleLB(n);
	}
	// 왼쪽아래가 직각인 이등변 삼각형
	static void triangleLB(int n) {
		Scanner sc = new Scanner(System.in);
	
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	//왼쪽위가 직각인 이등변삼각형
	static void triangleLU(int n) {
		Scanner sc = new Scanner(System.in);
		
	}
	//오른쪽아래가 직각인 이등변삼각형
	static void triangleRB(int n) {
		Scanner sc = new Scanner(System.in);
		
	}
	//오른쪽위가 직각인 이등변삼각형
	static void triangleRU(int n) {
		Scanner sc = new Scanner(System.in);
		
	}
	//n단 피라미드를 출력
	static void spira(int n) {
		Scanner sc = new Scanner(System.in);
		
	}
	//아래로 출력될수록 숫자가 늘어나는 피라미드형 숫자구조 작성
}

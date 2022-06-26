package algorithm.dataStructure.level1;

import java.util.Scanner;

/**
 * 
 * @author ksd49
 * *(별)을 출력하고 입력한 숫자에 줄바꿈을 하는 코드
 * n: 별의 수 / w:줄바꿈
 */
public class Astro {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, w;
		
		do {
			System.out.print("n값: ");
			n = sc.nextInt();
		}while(n <= 0);
		
		do {
			System.out.print("W값: ");
			w = sc.nextInt();
		}while(w <= 0 || w > n);
		
		for(int i=0; i<n; i++) {
			System.out.print("*");
			if(i % w == w - 1) {
				System.out.println();
			}
		}
		if(n % w != 0) {
			System.out.println();
		}
	}
}
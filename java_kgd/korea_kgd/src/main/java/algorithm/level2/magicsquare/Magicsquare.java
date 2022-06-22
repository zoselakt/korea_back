package algorithm.level2.magicsquare;

import java.util.Scanner;

public class Magicsquare {
	public static void main(String[] args) {
		// 입력한 값을 출력하는 Scanner를 입력한다.
		Scanner sc = new Scanner(System.in);
		int n;
		
		//반복문을 이용하여 홀수로 입력한 값이 아니면 오류를 내는 로직을 작성한다.
		while(true) {
			System.out.println("배열의 차수를 홀수로 입력하세요 : ");
			n = sc.nextInt();
			if(n % 2 == 1) {
				break;
			}
			System.out.println("홀수를 입력해야되!!!");
		}
		
		// 입력받은 배열의 차수만큼 배열을 선언한다.
		int data[][] = new int [n][n];
		
		// 마방진의 첫 번째 숫자가 채워지는 첫줄 가운데자리
		int i=0, j = (n-1) / 2;
		
		//Math.pow : x의 y승을 계산한다. 5의 5승
		for(int k=1; k<=Math.pow(n, 2); k++) {
			data[i][j] = k;
			//배열의 채운 숫자(k)가 5의 배수면 다음 숫자가 채워질 위치는 행만 1 증가시킨다.
			if(k % n == 0) {
				i++;
			} else {
				if(--i<0) {
					// 행이 배열의 범위를 벗어나면 마지막 행으로 변경한다.
					i = n-1;
				}
				if(++j == n) {
					// 열이 배열의 범위를 벗어나면 첫 번째열로 변경한다.
					j= 0;
				}
			}
		}
		// 각 열과 행에 입력값을 주는 로직을 작성한다. 
		for(i=0; i<n; i++) {
			for(j=0; j<n; j++) {
				System.out.printf("%3d ", data[i][j]);
			}
			System.out.println();
		}
	}
}

package algorithm.level2.circlenumber;

import java.util.Scanner;

public class CircleNumber {
	public static void main(String[] args) {
		// 입력한 값을 출력하는 Scanner를 입력한다.
		Scanner sc = new Scanner(System.in);
		System.out.println("배열의 차수를 홀수로 입력하세요 : ");
		
		//변수 n에 입력한int값을 넣는 코드를 입력한다. 
		int n = sc.nextInt();
		
		// 이중배열a를 만든다. 배열안에는 n의 값을 입력한다.
		int a[][] = new int[n][n];
		
		//count: 숫자증가변수, i: 행의값, j: 열의 값, sw: 부호변경, k: 반복횟수
		int count = 0, i=0, j = -1, sw = 1, k = n;
		
		//반복문을 사용하여 무한루프를 돌린다.
		while(true) {
			//행 방향 채우기 
			for(int p = 0; p < k; p++) {
				//행의 값에 sw값을 추가한다.
				j += sw;
				//배열값에 count값을 추가한다.
				a[i][j] = ++count;
			}
			// k의 값이 0이 되면 멈춘다.
			if(--k == 0) {
				break;
			}
			// 열 방향 채우기
			for(int p = 0; p < k; p++) {
				//열의 값에 sw값을 추가한다.
				i += sw;
				//배열값에 count값을 추가한다.
				a[i][j] = ++count;
			}
			
			sw *= -1;
		}
			for(i=0; i<n; i++) {  // i 와 j 가 이미 선언되어 오류가 날때 리턴타입을 지운다
				for(j=0; j<n; j++) { // 지운후 에러뜨는 것은 while문에 끝나는지점이 없어서 뜨는것.
					System.out.printf("%3d  ", a[i][j]);
				}
			System.out.println();
		}
	}
}

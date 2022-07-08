package algorithm.dataStructure.level3;

import java.util.Scanner;
/**
 * 
 * @author Administrator
 * 링버퍼의 활용
 * 링버퍼는 오래된 데이터를 버리는 용도로 사용할 수 있습니다.
 * n인 배열에 계속해서 데이터가 입력될 때 가장 최근에 들어온 데이터n개만 저장하고 버리는 용도ㅜ로 사용할때 사용된다.
 */

public class LastNElements {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int N = 10;
		int[] a = new int[N];
		int cnt = 0;
		int retry;
		
		System.out.println("정수를 입력하세요");
		
		do{
			System.out.printf("%d번째 정수: ", cnt+1);
			a[cnt++ % N] =sc.nextInt();
			
			System.out.print("계속할까요? (예.1 / 아니요.2): ");
			retry = sc.nextInt();
		}while(retry == 1);
		
		int i =cnt - N;
		if(i<0) {
			i=0;
		}
		for(; i<cnt; i++) {
			System.out.printf("%2d번쨰 정수: %d \n", i+1, a[i%N]);
		}
	}
}

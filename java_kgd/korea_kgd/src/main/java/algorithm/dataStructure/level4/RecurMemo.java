package algorithm.dataStructure.level4;

import java.util.Scanner;

/**
 * 
 * @author Administrator
 * recur메서드(IntStack 내 메서드)는 실행과정에서 같은 계산을 여러번 반복하여 수행한다.
 * n값이 커지면 반복하는 계산횟수는 더욱 늘어난다. 하지만 메모화기법을 사용하면 1회만 수행하여 중복계산할 필요가 없다.
 */
//재귀함수를 메모화로 구현
public class RecurMemo {
	static String[] memo;
	//메모화
	static void recur(int n) {
		//메모배열내 n+1값이 null과 같지 않다면 memo[n+1] 출력
		if(memo[n+1] != null) {
			System.out.print(memo[n+1]);//메모를 출력
		}else {
			// n이 0보다 크면 recur을 n-1을 할당 -> n값출력 후 -> n-2 재할당 -> ???
			if(n>0) {
				recur(n-1);
				System.out.println(n);
				recur(n-2);
				memo[n+1] = memo[n] + n + "\n" + memo[n-1]; //메모화
			}else {
				//memo배열에 빈값 할당
				memo[n+1]="";
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요: ");
		int x = sc.nextInt();
		
		memo = new String[x+2];
		recur(x);
	}
}

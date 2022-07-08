package algorithm.dataStructure.level4;

import java.util.Scanner;
/**
 * 
 * @author Administrator
 * 유클리드 알고리즘은 2개의 자연수 또는 정식(整式)의 최대공약수를 구하는 알고리즘이다.
예)
y = 0일때 최대공약수: x;
y != 0일때 : gcd(y, x % y)

1071과 1029의 최대공약수를 구하면,

1071은 1029로 나누어 떨어지지 않기 때문에, 1071을 1029로 나눈 나머지를 구한다. ≫ 42
1029는 42로 나누어 떨어지지 않기 때문에, 1029를 42로 나눈 나머지를 구한다. ≫ 21
42는 21로 나누어 떨어진다.
따라서, 최대공약수는 21이다.
 */

public class EuclidGCD {
	//정수 x, y의 최대공약수를 반환
	static int gcd(int x, int y) {
		if(y == 0) {
			return x;
		}else {
			return gcd(y, x % y);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("두 정수의 최대공약수를 구합니다. 두수를 입력하세요.");
		int x = sc.nextInt();
		int y = sc.nextInt();
		System.out.println("최대공약수는 " + gcd(x, y) + "입니다.");
	}
}

package algorithm.dataStructure.level1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 * @author ksd49
 * 주어진 배열요소 값을 역순으로 정렬하는 프로그램
 */
public class ReverseArray {
	//배열요소 a[idx1]과 a[idx2]의 값을 바꿈
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1]; a[idx1] = a[idx2]; a[idx2] = t;
	}
	// 배열의 요소을 역순으로 정렬
	static void reverse(int [] a) {
		for(int i =0; i<a.length / 2; i++) {
			swap(a, i ,a.length - i -1);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("요소수: ");
		int num = sc.nextInt();
		
		int [] x = new int[num];
		
		for(int i=0; i<num; i++) {
			System.out.println("x["+i+"]:" );
			x[i] = sc.nextInt();
		}
		
		reverse(x);
		
		System.out.println("역순정렬: x = "+Arrays.toString(x));
	}
}
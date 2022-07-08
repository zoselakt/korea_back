package algorithm.dataStructure.level1;

import java.util.Scanner;

/**
 * 
 * @author ksd49
 * 배열요소의 최댓값을 구하는 프로그램
 */
public class MaxOfArray {
	static int maxOf(int[] a) {
		int max = a[0];
		for(int i=0; i<a.length; i++) {
			if(a[i] > max) {
				max = a[i];
			}
		}
		return max;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("사람수: ");
		int num = sc.nextInt();
		
		int[] height = new int[num];
		
		for(int i=0; i<num; i++) {
			System.out.println("height["+i+"]:");
			height[i] = sc.nextInt();
		}
		System.out.println("최댓값: "+maxOf(height)+"CM");
	}
}

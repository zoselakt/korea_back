package algorithm.dataStructure.level5;

import java.util.Scanner;

/**
 * 
 * @author Administrator
 * 배열을나눔
 * 임의의 피벗값은 지정하여 피벗값을 중심으로 값을 나누고 정렬하는 프로그램
 * 어떤 요소를 피벗으로 선정했는가로 성능에 영향을 미친다.
 */

public class Partition {
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	//배열을 나눔
	static void partition(int[] a, int n) {
		int pl = 0;
		int pr = n-1;
		int x = a[n/2];
		
		do {
			while(a[pl] < x) {
				pl++;
			}
			while(a[pr] > x) {
				pr--;
			}
			if(pl <= pr) {
				swap(a, pl++, pr--);
			}
		}
		while(pl <= pr);
		
		System.out.println("피벗값은: " + x + "입니다.");
		
		System.out.println("피벗 이하의 그룹");
		for(int i = 0; i <= pl-1; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		
		if(pl > pr + 1) {
			System.out.println("피벗과 같은 그룹: ");
			for(int i = pr+1; i <= pl-1; i++) {
				System.out.print(a[i] + " ");
			}
			System.out.println();
		}
		
		System.out.println("피벗 이상의 그룹");
		for(int i = pr+1; i <= n; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("배열을 나눕니다. 요솟수: ");
		
		int nx = sc.nextInt();
		int[] x = new int[nx];
		
		for(int i = 0; i < nx; i++) {
			System.out.println("x[" + i + "]: ");
			x[i] =sc.nextInt();
		}
		partition(x, nx);
	}
}
 
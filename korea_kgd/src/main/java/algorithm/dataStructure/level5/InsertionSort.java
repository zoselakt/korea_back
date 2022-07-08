package algorithm.dataStructure.level5;

import java.util.Scanner;

/**
 * 
 * @author Administrator
 * 단순정렬 프로그램
 */
public class InsertionSort {
	static void insertionSort(int[] a, int n) {
		for(int i=1; i<n; i++) {
			int j;
			int tmp = a[i];
			for(j=i; j>0 && a[j-1] > tmp; j--) {
				a[j] = a[j-1];
			}
			a[j] = tmp;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("단순 삽입정렬 / 요솟수: ");
		int nx = sc.nextInt();
		int[] x = new int [nx];
		
		for(int i=0; i<nx; i++) {
			System.out.println("x[" + i + "]: ");
			x[i] = sc.nextInt();
		}
		
		insertionSort(x, nx);
		
		System.out.println("오름차순으로 정렬했습니다.");
		for(int i=0; i< nx; i++) {
			System.out.println("x["+i+"]= " + x[i]);
		}
	}
}

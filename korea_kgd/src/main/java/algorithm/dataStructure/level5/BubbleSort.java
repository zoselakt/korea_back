package algorithm.dataStructure.level5;

import java.util.Scanner;
/**
 * 
 * @author Administrator
 * 버블정렬 프로그램
 */

public class BubbleSort {
	
	//a[idx1] 값과 a[idx2] 값을 교환
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	//버전1
//	static void bubbleSort(int[] a, int n) {
		//패스
//		for(int i=0; i<n-1; i++) {
//			for(int j=n-1; j>i; j--) {
//				if(a[j-1] > a[j]) {
//					swap(a, j-1, j);
//				}
//			}
//		}
//	}
	//버전2
//	static void bubbleSort(int[] a, int n) {
//		for(int i=0; i<n-1; i++) {
//			int exchg = 0; //패스에서 교환하는 횟수를 저장
//			
//			//패스
//			for(int j=n-1; j>i; j--) {
//				if(a[j-1] > a[j]) {
//					swap(a, j-1, j);
//					exchg++;
//				}
//				//교환이 이루어지지않으면 멈춤
//				if(exchg == 0) {
//					break;
//				}
//			}
//		}
//	}
	//버전3
	static void bubbleSort(int[] a, int n) {
		//a[k]보다 앞쪽은 정렬을 마친상태
		int k = 0;
		while(k < n-1) {
			//마지막으로 요소를 교환한 위치
			int last = n-1;
			//패스
			for(int j = n-1; j > k; j--) {
				if(a[j-1] > a[j]) {
					swap(a, j-1, j);
					last = j;
				}
				k = last;
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("버블 정렬 / 요솟수: ");
		int nx = sc.nextInt();
		int[] x = new int[nx];
		
		for(int i=0; i<nx; i++) {
			System.out.println("x["+i+"]: ");
			x[i] = sc.nextInt();
		}
		bubbleSort(x, nx); //배열x를 버블정렬
		
		System.out.println("오름차순으로 정렬했습니다.");
		for(int i=0; i<nx; i++) {
			System.out.println("x["+i+"]= " + x[i]);
		}
	}
}

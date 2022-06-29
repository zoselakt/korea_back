package algorithm.dataStructure.level2;

import java.util.Scanner;

/**
 * 
 * @author ksd49
 * 선형검색 프로그램 -보초법으로 작성
 * 
 */

public class SeqSearch_sentinel {
	//int[]a: 요소의 값을 담을 배열 / int n i와 비교 / key요소수를 입력할 sc.next 변수
	static int seqSearch(int []a , int n, int key) {
		int i=0;
		
		// 보초를 추가
		a[n] = key; 
		
		//반복문으로 i(초기값)부터 배열 a에 key값이 일치할때까지 검색
		while(true) {
			if(a[i] == key) {
				break;
			}
			i++;
		}
		return i == n ? -1 : i;
	}
	public static void main(String[] args) {
		//Scanner객체
		Scanner sc = new Scanner(System.in);
		
		System.out.println("요솟수: ");
		int num = sc.nextInt();
		//요솟수자 num + 1인 배열
		int []x = new int[num + 1];
		
		//x배열에 i값을 넣을 반복문 (Scanner로 입력값을 받는다.)
		for(int i=0; i<num; i++) {
			System.out.print("x["+i+"]:");
			x[i] = sc.nextInt();
		}
		System.out.println("검색 값: ");
		
		// key값 재정의 / idx(인덱스)값 출력 (배열x에서 값이 key인 요소 검색)
		int key = sc.nextInt();
		int idx = seqSearch(x, num, key);
		
		//비교대상이 없으면 실패 / 있으면 출력
		if(idx == -1) {
			System.out.println("요소 출력 실패");
		}else{
			System.out.println("요소 x["+idx+"]에 있습니다.");
		}
	}
}

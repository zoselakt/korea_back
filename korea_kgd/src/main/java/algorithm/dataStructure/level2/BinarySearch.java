package algorithm.dataStructure.level2;

import java.util.Scanner;
/**
 * 
 * @author ksd49
 * 이진검색대상은 대상이 오름차순으로 정렬되어 있음을 가정후 진행한다.
 */
public class BinarySearch {
	//요소수가 n개인 배열a에서 key와 같은 요소를 이진검색
	static int BinarySearch(int[] a, int n , int key) {
		int pl = 0;
		int pr = n - 1;
		
		do {
			int pc = (pl + pr) / 2;
			//a배열과 key가 일치하면 검색성공!
			if(a[pc] == key) { 	
				return pc;
			//검색범위를 뒤쪽 절반으로 좁힘
			}else if(a[pc] < key) {
				pl = pc + 1;
			//검색범위를 앞쪽 절반으로 좁힘
			}else {
				pr = pc - 1;
			}
		//반복문을 사용하여 pl값이 pr보다 작거나 같을때까지 검색
		}while(pl <= pr);
		//검색실패시 -1리턴
		return -1;
	}
	public static void main(String[] args) {
		//스캐너 생성
		Scanner sc = new Scanner(System.in);
		
		System.out.println("요솟수: ");
		int num = sc.nextInt();
		int x[] = new int[num];
		
		System.out.println("오름차순으로 입력하세요: ");
		System.out.print("x[0]: ");
		x[0] = sc.nextInt();
		
		//반복문을 사용하여 x배열 값에 입력할 i값을 출력
		for(int i=1; i<num; i++) {
			do {
				System.out.print("x["+i+"]: ");
				x[i] = sc.nextInt();
			}while(x[i] < x[i-1]);
		}
		System.out.println("검색할 값: ");
		
		// key값 초기화 / idx(인덱스)값 출력 (배열x에서 값이 key인 요소 검색)
		int key = sc.nextInt();
		int idx = BinarySearch(x, num, key);
		
		//인덱스와 1이 같다면 오류 아니면 출력
		if(idx == 1) {
			System.out.println("그 값의 요소가 없습니다.");
		}else {
			System.out.println("그 값은 x["+idx+"]에 있습니다.");
		
		}
	}
}

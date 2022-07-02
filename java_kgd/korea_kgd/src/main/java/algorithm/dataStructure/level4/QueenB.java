package algorithm.dataStructure.level4;

public class QueenB {
	static boolean[] flag_a = new boolean[8]; // 각행에 퀸을 이미 배치했는지체크
	static boolean[] flag_b = new boolean[15]; //2시 방향의 대각선
	static boolean[] flag_c = new boolean[15]; // 10시방향 대각선
	static int[] pos = new int[8];  // 각 열에 있는 퀸의 위치
		
	//각열에있는 퀸의 위치를 출력
	static void print() {
		for(int i=0; i<8; i++) {
			System.out.printf("%2d", pos[i]);
		}
		System.out.println();
	}
	//i열에 퀸을 일괄 배치
//	static void set(int i) {
//		for(int j=0; j<8; j++) {
//			pos[i] = j;
//			if(i == 7) {
//				print();
//			}else {
//				set(i+1);
//			}
//		}
//	}
	
	//i열에 알맞는 위치에 배치 / 파라미터로 i를 받는다.
//	static void set(int i) {
//		for(int j=0; j<8; j++) {
//			//j행에 퀸을 아직 배치하지 않음
//			if(flag[j] == false) {
//				//j행에 배치
//				pos[i] = j;
//				//모든 열에 배치
//				if(i==7) {
//					print();
//				}else {
//					flag[j] = true;
//					set(i+1);
//					flag[j] = false;
//				}
//			}
//		}
//	}
	static void set(int i) {
		for(int j =0; j < 8; j++) {
			if(flag_a[j] == false && //가로 j 행에 아직 배치하지 않음.
					flag_b[i+j] == false && //두시방향대각선 행에 아직 배치하지 않음.
						flag_c[i-j+7] == false) {//10시방향대각선  행에 아직 배치하지 않음.
				//
				pos[i] = j;	//퀸을 i행에 배치
				if(i==7) { //모든 열에 배치
					print();
				}else {
					flag_a[j] = flag_b[i+j] = flag_c[i-j+7] = true;
					set(i+1);
					flag_a[j] = flag_b[i+j] = flag_c[i-j+7] = false;
				}
			}
		}
	}
	public static void main(String[] args) {
		set(0);
	}
}

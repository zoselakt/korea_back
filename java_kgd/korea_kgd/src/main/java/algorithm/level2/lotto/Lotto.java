package algorithm.level2.lotto;

import java.util.Random;
import java.util.Scanner;

public class Lotto {
	public static void main(String[] args) {
		// 입력한 값을 출력하는 Scanner를 입력한다.
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
		// 번호에 맞는 배열을 작성한다.
		int lottoAr[] = new int[6];
		int userAr[] = new int[6];
		
		//보너스 변수를 생성한다.
		int bonus;
		int bonusUser;
		int count = 0;
		
		//로또 배열에 6개의 랜덤값을 저장
		for(int i=0; i<6; i++) {
			lottoAr[0] = random.nextInt(45) + 1;
		}
		
		//bonus
		bonus = random.nextInt(45)+1;
		
		//사용자에게 6개의 값을 입력
		System.out.println("숫자를 입력하세요");
		for(int i=0; i<6; i++) {
			userAr[i]=sc.nextInt();
		}
		
		// 보너스 값 입력
		System.out.print("보너스 숫자를 입력하세요");
		bonusUser = sc.nextInt();
		
		//로또배열의 값과 사용자 배열의 값 중 같은 값이몇개 있는지 카운팅
		for(int i=0; i<6; i++) {
			for(int j =0; j<6; j++) {
				if(lottoAr[j] == userAr[i]) {
					count++;
				}
			}	
		}
		// 사용자가 입력한 값이 맞으면 등수에 맞는 값을 출력하는 로직을 작성한다.
		if (count ==6) {
			System.out.println("1등입니다!");
		}
		else if (count ==5) {
			if(bonus == bonusUser) {
			System.out.println("2등입니다.");
		}
			else {
				System.out.println("3등입니다.");
				}
		}
		else if(count==4) {
			System.out.println("4등입니다.");
		}
		else if(count==3) {
			System.out.println("5등입니다.");
		}
		else {
			System.out.println("탈락");
		}
	}
}

package algorithm.level2.baseball;

import java.util.Random;
import java.util.Scanner;

public class BaseBall {
	public static void main(String[] args) {
		// 0~9까지의 배열변수를 만든다.
		int ball[] = {0,1,2,3,4,5,6,7,8,9};
		
		//랜덤한 값을 출력하기 위한 랜덤객체를 생성한다.
		Random random = new Random();
		
		//반복문을 이용하여 랜덤한 값을 출력할 정렬값을 출력한다.
		for(int i=0; i<1000000; i++) {
			int r = random.nextInt(9) + 1;
			int temp = ball[0];
			ball[0] = ball[r];
			ball[r] = temp;
		}
		//입력을 받는 객체를 생성한다 .
		System.out.println("레벨을 입력하세요: ");
		Scanner sc = new Scanner(System.in);
		//레벨값을 받는 변수생성
		int level = sc.nextInt();
		
		//키보드 버퍼를 비운다.
		sc.nextLine();
		int count = 0;
		
		// 문제해결까지의 시간을 구할 객체를 생성한다. (1900년 1월 1일부터 이 메소드가 실행되는 순간까지 지난시간)
		long start = System.currentTimeMillis();
		
		// 반복문을 이용하여 스트라이크, 볼을 구한다. / 매 반복마다 다시 계산되어져야 한다.
		while(true) {
			System.out.println("User: ");
			String user = sc.nextLine();
			count++;
			int s=0, b=0;
			for(int i=0; i<level; i++) {
				//스트라이크 값 / 아스키코드값 계산
				if(ball[i] == user.charAt(i) -48) {
					s++;
				}
				//볼 값계산
				if(user.indexOf(ball[i] + "") >= 0) {
					b++;
				}
			}
			//
			if(s == level) {
				break;
			}
			// 스트라이크, 볼을 콘솔에 출력
			System.out.println(s+" 스트라이크 " + (b - s) + " 볼 ");
		}
		//게임종료시간을 구한다.
		long end = System.currentTimeMillis();
		System.out.println((end - start) / 1000. + "초" + "" +count+"번에 맞췄다.");
	}
}

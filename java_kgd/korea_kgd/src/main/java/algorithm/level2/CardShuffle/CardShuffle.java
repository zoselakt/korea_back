package algorithm.level2.CardShuffle;

import java.util.Random;

public class CardShuffle {

	public static void main(String[] args) {
		// 카드와 맞는 배열변수를 생성한다
		String number[] = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
		char symbol[] = {'♠', '♥', '♣', '◆'};
		
		// 표현가능한 카드의 총합을 배열로만든다.
		int card[] = new int[52];
		
		//반복문을 사용하여 51까지의 숫자를 출력한다.
		for(int i=0; i<card.length; i++) {
			card[i] = i;
		}
		//반복문을 사용하여 카드의 정렬된 순서를 얻는 코드를 구현한다. 
		for (int i=0; i<card.length; i++) {
			System.out.printf("%c%2s", symbol[card[i]/ 13], number[card[i]% 13]);
			if((i+1) % 13 ==0) {
				System.out.println();
			}
		}
		System.out.println("=====================================");
		//카드 섞기위한 랜덤값생성
		Random random = new Random();
		
		// 카드 배열정렬하여 정렬값을 얻는다.
		for(int i=0; i<1000000; i++) {
			int r = random.nextInt(51)+1;
			int temp = card[0];
			card[0] = card[r];
			card[r] = temp;
		}
		for (int i=0; i<card.length; i++) {
			System.out.printf("%c%2s", symbol[card[i]/ 13], number[card[i]% 13]);
			if((i+1) % 13 ==0) {
				System.out.println();
			}
		}
	}
}

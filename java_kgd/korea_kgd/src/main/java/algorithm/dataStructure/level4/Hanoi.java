package algorithm.dataStructure.level4;

import java.util.Scanner;

/**
 * 
 * @author ksd49
 * 하노이의 탑연습
 * 쌓아놓은 원반을 최소 횟수로 옮기기위한 알고리즘
 */

public class Hanoi {
	//no 개의 원반은 x번 기둥에서 y번기둥으로 옮김
	static void move(int no, int x, int y) {
		//no 가 1보다 많을시 move메서드내 no - 1,
		//시작기둥에서 중간기둥으로 옮김
		if(no > 1) {
			move(no-1, x, 6-x-y);
		}
		
		System.out.printf("원반 [%d] 를 %d번 기둥에서 %d번 기둥으로 옮김 \n", no, x, y);
		
		//중간기둥에서 목표기둥으로 옮김
		if(no > 1) {
			move(no-1, 6-x-y, y);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("하노이의 탑 원반의 갯수: ");
		int n = sc.nextInt();
		
		//1번 기둥에 쌓인 n개의 원반을 3번 기둥으로 옮김
		move(n, 1, 3);
	}
}
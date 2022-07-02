package algorithm.dataStructure.level3;

import java.util.Scanner;

public class IntQueueTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		IntQueue que = new IntQueue(64);
		
		while(true) {
			System.out.println();
			System.out.printf("현재 데이터 갯수: %d / %d \n", que.size(), que.getCapacity());
			System.out.print("(1) 인큐 / (2)디큐 / (3) 피크 / (4)덤프 / (0)종료");
			
			int menu = sc.nextInt();
			if(menu == 0) {	break;	}
			
			int x;
			switch(menu) {
				case 1:
					System.err.print("데이터: ");
					x = sc.nextInt();
					try {
						que.enque(x);
					}catch(IntQueue .OverflowintQueueException e) {
						System.out.println("큐가 가득 찼습니다");
					}
				break;
				case 2:
					try {
						x = que.deque();
						System.out.println("디큐한 데이터는 "+ x + "입니다.");
					}catch(IntQueue.EmptyIntQueueException e) {
						System.out.println("큐가 비어 있습니다.");
					}
					break;
				case 3:
					try {
						x=que.peek();
						System.out.println("피크한 데이터는 "+ x + "입니다.");
					}catch(IntQueue.EmptyIntQueueException e) {
						System.out.println("큐가 비어 있습니다.");
					}
					break;
				case 4:
					que.dump();
					break;
			}
		}
	}
}

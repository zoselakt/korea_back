package algorithm.level3.cafe;

import java.util.Scanner;

public class Cafe {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 카페주문프로그램
		// C, R : 주문하기
		// 1. 메뉴출력 / 2.메뉴입력 / 3. 메뉴가격입력/ 4.메뉴에 추가/ 5. 주문개수를 한개 증가.
		// U : 취소하기
		// 1. 주문한 메뉴리스트 출력 / 2. 취소메뉴출력/ 3. 입력받은 주문를 주문리스트에서 제거 / 4. 총 금액에서 치김
		// 5. 주문한 갯수 한개 감소
		// D : 결재하기
		// 1. 결재해야할 총 금액 출력 /2. 지불할 금액을 입력받는다. /3. 지불할 금액과 총금액을 비교계산한다.
		// 4. 계산이 완료되었으면 총 금액은0원으로 주문리스트는 비워준다./5. 전체 갯수를 초기화한다.
		
		int count = 0; // 주문갯수
		String OrderList[]=new String[5]; //주문은 5개까지 가능 
		int total =0; //총 금액
		
		while(true) {
			System.out.println("§ ☆★☆★☆★ ＠Cafe＠ ☆★☆★☆★ §");
			System.out.println("1. 주문하기");
			System.out.println("2. 취소하기");
			System.out.println("3. 결제하기");
			System.out.println("4. 끝내기");
			System.out.print("입력:");
			int num= sc.nextInt();
			if(num==1) {
				String menuName;
				int menuPrice;
				System.out.println("1. 아메리카노 /t 3800원");
				System.out.println("2. 카페모카 /t 4200원");
				System.out.println("3. 카페라떼 /t 4200원");
				System.out.println("4. 카라멜마끼아또 /t 4500원");
				System.out.print("주문할 메뉴번호:");
				int menuNum = sc.nextInt();
				if(menuNum==1) {
					menuName="아메리카노";
					menuPrice = 3800;
				}
				else if (menuNum==2) {
					menuName="카페모카";
					menuPrice = 4200;
				}
				else if (menuNum==3) {
					menuName="카페라떼";
					menuPrice = 4200;
				}
				else if (menuNum==4) {
					menuName="카라멜마끼아또";
					menuPrice = 4500;
				}
				else {
					System.out.println("잘못입력하셨습니다.");
					continue;
				}
				total += menuPrice;
				OrderList[count] = menuName; // 주문 수량 
				count++;
				System.out.println("주문한 메뉴:" + menuName +"가격:"+menuPrice+"입니다.");
			}
			else if(num==2) { // 취소하기 목록메뉴 
				
				System.out.println("주문 목록"); // 목록
				for(int i=0; i<count; i++) {
					System.out.println(i+ 1+ "," +OrderList[i]);;
				}
				System.out.println("취소할 메뉴 번호:"); // 주문취소
				int cancelNum = sc.nextInt();
				if(1<=cancelNum && cancelNum <=count) {
					String delMenu = OrderList[cancelNum - 1];
					System.out.println(delMenu + "메뉴삭제!");
					for(int i=cancelNum-1; i<count; i++) {
						OrderList[i] =OrderList[i+1]; 
					}
					if(delMenu.equals("아메리카노")) {
						total-=3800;
					}
					else if(delMenu.equals("카페모카")) {
						total -= 4200;
					}
					else if(delMenu.equals("카페라떼")) {
						total -= 4200;
					}
					else if(delMenu.equals("밀크티" )) {
						total -= 4500;
					}
					count--;
				}
			}
			else if(num==3) {
				System.out.println("결재할 금액:" + total + "원");
				System.out.println("지불할 금액:");
				int money = sc.nextInt();
				if(money<total) {
					System.out.println("금액이 부족합니다.");
					continue;
				}
				else {
					System.out.println("남은 금액은 " + (money-total) + "원 입니다.");
					total = 0;
					for(int i=0; i<5; i++) {
						OrderList[i] = "";
					}
					count =0;
				}
			}
			else if(num==4) {
				System.out.println("주문종료");
				break;
			}
			else {
				System.out.println("잘못입력하였습니다.");
			}
		}
	}
}

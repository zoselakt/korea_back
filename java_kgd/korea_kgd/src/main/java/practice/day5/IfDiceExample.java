package practice.day5;

public class IfDiceExample {

	public static void main(String[] args) {
		//주사위 번호 하나 뽑기
		
		//정수타입으로 변수 생성후 랜덤한 1~6까지의 정수를 얻는다.
		int num = (int)(Math.random()*6) +1;
		
		//1~6까지의 각각의 정수타입을 얻는다
		if(num == 1) {
			System.out.println("1");
		}else if(num == 2) {
			System.out.println("2");
		}else if(num == 3) {
			System.out.println("3");
		}else if(num == 4) {
			System.out.println("4");
		}else if(num == 5) {
			System.out.println("5");
		}else {
			System.out.println("6");
		}
	}
}

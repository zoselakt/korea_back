package practice.day5;


public class WhileKeyControlExample {

	public static void main(String[] args) throws Exception {
		boolean run = true;
		int speed = 0;
		int keyCode = 0;
		
		while(run) {
			//Enter가 입력되면 캐리지리턴(13)과 라인피드(10)가 입력되므로 이 값을 제외 시킴
			if(keyCode != 13 && keyCode !=10) {
				//메뉴생성
				System.out.println("1. 증속 / 2. 감속 / 3.중지");
				System.out.print("선택: ");
			}
			//키보드의 키코드를 읽음
			keyCode = System.in.read();
			
			// '1' 입력시
			if(keyCode == 49) {
				speed++;
				System.out.println("현재속도: "+speed);
				//'2' 입력시
			}else if(keyCode == 50) {
				speed--;
				System.out.println("현재속도: "+speed);
				//'3'입력시
			}else if(keyCode == 51) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}

}

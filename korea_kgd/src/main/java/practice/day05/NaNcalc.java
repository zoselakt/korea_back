package practice.day05;

public class NaNcalc {
	public static void main(String[] args) {
		//사용자로부터 입력받은 값
		String userInpit = "NaN";
		//더블로 타입변환
		double val = Double.valueOf(userInpit);
		
		double currentBalance = 10000.0;
		
		//NaN 검사
		if(Double.isNaN(val)) {
			//NaN일 경우 실행되는 코드
			System.out.println("NaN이 입력되어 처리 불가"); //출력값1
			val = 0.0;
		}//출력값2: 10000.0
		
		//currentBalance에 NaN이 저장
		currentBalance += val;
		System.out.println(currentBalance); // if 값이 없다면 결과는 NaN
	}
}

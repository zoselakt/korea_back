package practice.day5;

public class Overflow {

	public static void main(String[] args) {
		try {
			int result = safeAdd(2000000000, 2000000000);
			System.out.println(result);
		} catch (Exception e) {
			System.out.println("오버플로우 발생하여 계산불가");
		}
	}

	
	public static int safeAdd(int left, int right) {
		if(right > 0) {
			if(left > (Integer.MAX_VALUE - right)) {
				throw new ArithmeticException("오버플로우 발생");
			}
		}else{
			if(left < (Integer.MIN_VALUE - right)) {
				throw new ArithmeticException("오버플로우 발생");
			}
		}
		return left + right;
	}
}

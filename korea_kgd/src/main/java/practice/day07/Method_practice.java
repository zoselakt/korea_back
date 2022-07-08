package practice.day07;

public class Method_practice {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		calc.powerOn();
		
		int result1 = calc.plus(5, 6);
		System.out.println("result1: " +result1);
		
		byte x = 10;
		byte y = 4;
		double result2 = calc.divide(x, y);
		System.out.println("result2: " + result2);
		
		calc.powerOff();
		
		System.out.println("===============");
		
		int[] values3 = {1,2,3};
		int result3 =calc.sum1(values3);
		System.out.println("result3: "+result1);
		
		int result4 = calc.sum1(new int [] {1,2,3,4,5});
		System.out.println("result4: " + result2);
		
		int result5 = calc.sum2(1,2,3);
		System.out.println("result5: " + result5);
		
		int result6 = calc.sum2(1,2,3,4,5);
		System.out.println("result6: " + result6);
	}
}

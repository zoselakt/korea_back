package practice.day12;

/**
 * 
 * @author ksd49
 * 주어진 값이 모두 숫자이면 true / 아니면 false (null, 공백포함)
 */
public class Exercise6_22 {
	static boolean isNumber(String str){
		if(str == null || str.equals("")) {
			return false;
		}
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(ch < '0' || ch > '9') {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		String str = "123";
		System.out.println(str+ "은 숫자입니까?" + isNumber(str));
		
		str = "1234o";
		System.out.println(str+ "은 숫자입니까?" + isNumber(str));
	}
}

package practice.day04;

public class MemberService {
	public boolean login(String id, String password) {
		if(id.equals("hong") && password.equals("12345")) {
			return true;
		}else {
			return false;
		}
	}
	public void logout(String id) {
		System.out.println("로그아읏 되었습니다.");
	}
	public static void main(String[] args) {
		MemberService memberService = new MemberService();
		boolean result = memberService.login("hong", "12345");
		if(result == true) {
			System.out.println("로그인 성공!");
		}else {
			System.out.println("로그인 실패");
		}
	}
}

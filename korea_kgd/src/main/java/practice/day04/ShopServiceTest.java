package practice.day04;

public class ShopServiceTest {
	public static void main(String[] args) {
		ShopService s1 = ShopService.getShopService();
		ShopService s2 = ShopService.getShopService();
		
		if(s1 == s2) {
			System.out.println("같은 객체");
		}else {
			System.out.println("다른 객체");
		}
	}
}

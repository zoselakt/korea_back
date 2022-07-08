package practice.day04;

public class ShopService {
	private static ShopService singleton = new ShopService();
	
	private ShopService() {}
	
	public static ShopService getShopService() {
		return singleton;
	}
}

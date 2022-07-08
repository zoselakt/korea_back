package practice.day06;

public class AirplaneSuper extends Airplane{
	public static final int NORMAL = 1; 
	public static final int SUPERSONIC = 2;
	
	public int flyMode = NORMAL;
	
	@Override
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("초음속비행 합니다.");
		}else{
			//fly객체호출
			super.fly();
		}
	}
}

package practice.day12;

/**
 * 
 * @author ksd49
 * 두점간의 거리를 구하는 문제
 * 
 */
public class Exercise6_6 {
	public static void main(String[] args) {
		MyPoint p = new MyPoint(1, 1);
		System.out.println(p.getDistance(2, 2));
	}
}

class MyPoint{
	int x;
	int y;
	
	public MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
	double getDistance(int x1, int y1) {
		return Math.sqrt((x-x1) * (x-x1) + (y-y1) * (y-y1));
	}
}

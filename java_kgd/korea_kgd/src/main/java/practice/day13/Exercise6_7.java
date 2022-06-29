package practice.day13;

public class Exercise6_7 {
	public static void main(String[] args) {
		MyPoint mp = new MyPoint(1, 1);
		
		System.out.println(mp.getDistance(2, 2));
	}
}


class MyPoint{
	int x;
	int y;
	
	public MyPoint(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	double getDistance(int x1, int y1){
		return Math.sqrt( (x-x1)*(x-x1)+(y-y1)*(y-y1) );
	}
}
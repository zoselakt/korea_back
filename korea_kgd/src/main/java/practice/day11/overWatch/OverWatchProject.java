package practice.day11.overWatch;

import java.util.Scanner;

public class OverWatchProject {
	public static void main(String[] args) {
		OverWatch overWatch;
		System.out.println("1. 메이 | 2. 리퍼 | 3. 맥크리");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		if(n == 1){
			overWatch = new Mei();
		}else if(n == 2) {
			overWatch = new Reaper();
		}else {
			overWatch = new Mecree();
		}
		
		overWatch.name();
		overWatch.lClick();
		overWatch.rClick();
		overWatch.shiftButton();
		overWatch.eButton();
		overWatch.qButton();
	}
}
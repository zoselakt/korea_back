package com.mod.mod005;

public class Figure {

	public static void main(String[] args) {
		double figure_10 = Math.round(Math.random() * 10);
		double figure_100 = Math.round(Math.random() * 100);
		double figure[] = {70,50,30,5,1,0.5,0.1};
		
		for(int i=0; i<figure.length; i++) {	
			if(figure_100 >= figure[i]) {
				System.out.println("동그라미");
			}else if (figure_100 >= figure[i]) {
				System.out.println("삼각형");
			}else if (figure_100 >= figure[i]) {
				System.out.println("사각형"); 
			}else if (figure_100 >= figure[i]) {
				System.out.println("오각형");
			}else if (figure_100 >= figure[i]) {
				System.out.println("육각형");
			}else if (figure_10 >= figure[i]) {
				System.out.println("팔각형");
			}else if (figure_10 >= figure[i]){
				System.out.println("별");
			}
			
		}
		
	}
}

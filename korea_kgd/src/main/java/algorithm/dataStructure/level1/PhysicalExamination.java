package algorithm.dataStructure.level1;

import java.util.Scanner;
/**
 * 
 * @author ksd49
 * 평균 키와 시력분포를 구하는 문제
 */
public class PhysicalExamination {
	// 시력 분포를 위한 상수
	static final int VMAX = 21;
	
	//내부클래스를 구현하여 평균 키와 시력을 구하는 클래스를 작성
	static class PhyscData{
		//이름, 키, 시력 변수와 생성자
		String name;
		int height;
		double vision;
		
		PhyscData(String name, int height,double vision){
			this.name = name;
			this.height = height;
			this.vision = vision;
		}
	}
	//평균키를 계산할 메서드 (파라미터 클래스배열 dat) / 객체배열은 객체내부의 값에 배열요소를 입력하기 위하여 사용된다.
	static double aveheight(PhyscData[] dat) {
		double sum = 0;
		
		//반복문을 사용하여 dat(파라미터).height(PhyscData내부 변수)에 반복문 값을 넣는다.
		for(int i=0; i<dat.length; i++) {
			sum += dat[i].height;
		}
		return sum / dat.length;
	}
	
	//시력 분포를 구하는 메소드 클래스배열과 배열을 받는다.
	static void distVision(PhyscData[] dat, int[] dist) {
		// i로된 변수와 dist값을 초기화한다.
		int i=0;
		dist[i] = 0;
		
		//반복문을 사용하여 dat.vision에 0.0보다 크거나 같은 값과 dat.vision보다 큰거나 같은 Vmax / 10까지 값을 비교 출력하는반복문을 작서 
		for(i=0; i<dat.length; i++) {
			if(dat[i].vision >= 0.0 && dat[i].vision <= VMAX / 10.0) {
				dist[(int)(dat[i].vision * 10)]++;
			}
		}
	}
	public static void main(String[] args) {
		//콘솔에 입력하는 코드
		Scanner sc = new Scanner(System.in);
		
		//physcData객체 배열에 담는 코드를 작성
		PhyscData[] x= {
			new PhyscData("유비", 162, 0.3),
			new PhyscData("관우", 173, 0.7),
			new PhyscData("장비", 175, 2.0),
			new PhyscData("조조", 171, 1.5),
			new PhyscData("여포", 168, 0.4),
			new PhyscData("손책", 174, 1.2),
			new PhyscData("손권", 169, 0.8),
		};
		
		//VMAX를 받는 vdist배열을 만든다.
		int[] vdist = new int[VMAX];
		
		System.out.println("신체검사 리스트");
		System.out.println("이름       키      시력");
		System.out.println("----------------------");
		
		//반복문을 사용하여 x(PhyscData객체명)내부 값을 받아 각 변수에 값을 넣는다.
		for(int i=0; i<x.length; i++) {
			System.out.printf("%-8s%3d%5.1f \n", x[i].name, x[i].height, x[i].vision);
		}
		System.out.printf("\n 평균키: +%5.1fcm\n",aveheight(x));
		
		//시력분포를 출력하는 메소드에 x와 vdist의 값을 파라미터로 넣어준다.
		distVision(x, vdist);
		
		//반복문으로 0.0부터 2.0까지의 시력분포값을 출력한다.
		System.out.println("\n 시력분포");
		for(int i=0; i<VMAX; i++) {
			System.out.printf("%3.1f~:%2d명\n", i / 10.0, vdist[i]);
		}
	}
}

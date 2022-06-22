package com.singleton.day02;

public class StaticSingleTon {
	private static StaticSingleTon instance;
	
	static {
		try {
			instance = new StaticSingleTon();
		}catch (Exception e){
			System.out.println("정적블록을 이용한 싱글톤 작성");
		}
	}
	private StaticSingleTon() {};
	
	public static StaticSingleTon getInstance(){
		return instance;
	}
}

package com.mod.mod010;

public class FlyerTest {

	public static void main(String[] args) {
		//객체는 airplane, 참조는 Flyer
		Flyer f = new Airplane();
		f.takeOff();
		f.fly();
		f.land();
	}
}

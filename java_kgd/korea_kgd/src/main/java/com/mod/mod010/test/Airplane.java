package com.mod.mod010.test;

public class Airplane implements Flyer{
	public void fly() {
		System.out.println("비행기가 이륙하고 있습니다.");
	}
	public void flying() {
		System.out.println("비행기가 하늘을 날고있습니다.");
	}
	public void landing() {
		System.out.println("비행기가 착륙을 준비합니다.");
	}
	public void land() {
		System.out.println("착륙완료");
	}
}

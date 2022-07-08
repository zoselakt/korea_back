package com.mod.mod010.test;

public class Bird implements Flyer{
	public void fly() {
		System.out.println("새가 날아오릅니다.");
	}
	public void flying() {
		System.out.println("새가 날고 있습니다.");
	}
	public void landing() {
		System.out.println("새가 앉으려합니다.");
	}
	public void land() {
		System.out.println("새가 쉬고있습니다.");
	}
}

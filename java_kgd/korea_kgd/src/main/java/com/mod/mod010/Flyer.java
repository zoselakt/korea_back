package com.mod.mod010;

/**
 * abstract의 집합 변수x , 상수(public)o
 * 인스턴스 생성불가
 * 다중상속 지원
 * 인터페이스에서는 기본이 public, abstract이기때문에 명시적으로 안써도 가능
 * @author Administrator
 *
 */
public interface Flyer {
	public void fly();
	public void takeOff();
	public void land();
}

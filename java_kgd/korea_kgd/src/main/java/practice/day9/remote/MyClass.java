package practice.day09.remote;

public class MyClass {
	RemoteControl rc = new Television();
	
	//인터페이스로 구현하려면 인터페이스 변수 = 구현객체로 대입해야한다. 
	MyClass(RemoteControl rc){
		this.rc = rc;
	}
	void methodA() {
		RemoteControl rc = new Audio();
	}
	void methodB(RemoteControl rc) {}
}

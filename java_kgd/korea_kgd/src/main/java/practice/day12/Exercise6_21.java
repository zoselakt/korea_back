package practice.day12;

public class Exercise6_21 {
	public static void main(String[] args) {
		MyTv t = new MyTv();
		
		t.channer = 100;
		t.volume = 0;
		System.out.println("채널: "+ t.channer+ ", 볼륨: " + t.volume);
		
		t.channerDown();
		t.volumeDown();
		System.out.println("채널: "+ t.channer+ ", 볼륨: " + t.volume);
		
		t.volume = 100;
		t.channerUp();
		t.volumeUp();
		System.out.println("채널: "+ t.channer+ ", 볼륨: " + t.volume);
	}
}
class MyTv{
	boolean isPowerOn;
	int channer;
	int volume;
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNER = 100;
	final int MIN_CHANNER = 1;
	
	void turnOnOff() {
		if(isPowerOn == true) {
			isPowerOn = false;
		}else {
			isPowerOn = true;
		}
	}
	void volumeUp() {
		if(volume < MAX_VOLUME) {
			++volume;
		}
	}
	void volumeDown() {
		if(volume > MIN_VOLUME) {
			--volume;
		}
	}
	void channerUp() {
		++channer;
		if(channer == MAX_CHANNER) {
			channer = MIN_CHANNER;
		}
	}
	void channerDown() {
		--channer;
		if(channer == MIN_CHANNER) {
			channer = MAX_CHANNER;
		}
	}
}

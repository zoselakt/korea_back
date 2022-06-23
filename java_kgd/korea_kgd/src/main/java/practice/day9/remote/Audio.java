package practice.day09.remote;

public class Audio implements RemoteControl{
	private int volume;
	private boolean mute;
	
	public void turnOn() {
		System.out.println("Audio를 켭니다.");
	}
	//turnoff 추상메소드의 실제 메소드
	public void turnOff() {
		System.out.println("Audio를 끕니다");
	}
	
	//setvolume 추상메소드의 실제 메소드
	public void setVolume(int volime) {
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if(volume > RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("현재 Audio 볼륨: " + this.volume);
	}
	@Override // 디폴트 메소드 재정의
	public void setMute(boolean mute) {
		this.mute = mute;
		if(mute) {
			System.out.println("Audio 무음처리");
		}else {
			System.out.println("Audio 무음해제");
		}
	}
}

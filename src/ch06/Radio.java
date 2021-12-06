package ch06;

public class Radio {

	int channel;
	String color;
	boolean turn;
	
	public void turnOn() {
		turn = true;
		System.out.println("전원을 킵니다.");
	}
	public void turnOff() {
		turn = false;
		System.out.println("전원을 끕니다.");
	}
	public void volumeUp() {
		channel++;
		System.out.println("소리를 키웁니다.");
	}
	public void volumeDown() {
		channel--;
		System.out.println("소리를 낮춥니다.");
	}
	
}

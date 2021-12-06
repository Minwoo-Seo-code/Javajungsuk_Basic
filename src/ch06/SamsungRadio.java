package ch06;

public class SamsungRadio {

	public static void main(String[] args) {
		Radio samSung = new Radio();
		
		samSung.channel = 7;
		
		samSung.volumeUp();
		System.out.println(samSung.channel);
		
		samSung.volumeDown();
		System.out.println(samSung.channel);
		
		samSung.color = "Yellow";
		System.out.println("삼성 라디오의 색상은 " + samSung.color + " 입니다.");
		
		samSung.turn = false;
		
		samSung.turnOn();
		System.out.println(samSung.turn);
		
		samSung.turnOff();
		System.out.println(samSung.turn);
	}
}

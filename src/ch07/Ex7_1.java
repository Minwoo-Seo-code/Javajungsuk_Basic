package ch07;

class Tv {
	boolean power;
	int channel;
	
	void powerOn() { power = !power; }
	void ChannelUp() { ++channel; }
	void ChannelDown() {--channel;}
	
}

class SmartTv extends Tv {
	boolean caption;
	void displayCaption(String text) {
		if (caption) {
			System.out.println(text);
		}
	}
}

class Ex7_1 {
	public static void main(String[] args) {
		SmartTv stv = new SmartTv();	//SmartTv가 Tv를 상속받음으로서 
										//Tv가 가지고 있는걸 사용할 수 있다.
		stv.channel = 10;
		stv.ChannelUp();
		
		System.out.println(stv.channel);
		
	}									
}















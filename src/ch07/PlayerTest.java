package ch07;

abstract class Player {	// 추상 클래스는 오직 추상 메소드만 가진다.
	abstract void play(int pos);	// 추상 메소드, 구현부만 존재하는 메소드이다.
	abstract void stop();
}

class AudioPlayer extends Player {

	void play(int pos) { System.out.println(pos + " 위치에서 play 합니다."); }
	
	void stop() { System.out.println("재생을 멈춥니다."); }
	
}
public class PlayerTest {	// abstract 클래스를 상속받으면 
							// 모든 추상 메소드들을 구현해야 객체를 생성할 수 있다.

	public static void main(String[] args) {
		
		Player p = new AudioPlayer();
		p.play(100);
		p.stop();
	}

}

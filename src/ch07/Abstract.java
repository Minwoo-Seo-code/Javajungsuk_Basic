package ch07;

abstract class Abstract { //추상 클래스

	abstract void move();	//추상 메소드
	//abstract는 추상, 미완성이라는 뜻이다.
	/*
	 * abstract class는 미완성 설계도이며, 인스턴스를 생성할 수 없다.
	 * 그러면 어떻게 사용하면 되냐?
	 * -상속을 통해서 완전한 클래스를 만들어서 사용한다.
	 * */
}
	class AbsTest extends Abstract {

		void move() {
			System.out.println("testDone");
		}
	}
	

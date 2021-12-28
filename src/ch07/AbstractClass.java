package ch07;

abstract class AbstractClass { //설계도가 미완성인 클래스를 추상 클래스라고 한다.
	
	abstract void play(int pos);	//구현부만 있고 몸통이 없는 메소드를 추상메소드라고 한다.
	abstract void stop();			//추상 메소드를 가지고 있으면 추상 클래스이다.

}

	/*	
	 * 상속을 통해 추상 메서드를 완성해야 인스턴스를 생성할 수 있다.
	 * 
	 * 추상 클래스와 추상 메소드를 사용하는 이유는 "다형성"을 구현하기 위해서 사용한다.
	 * 
	 * */
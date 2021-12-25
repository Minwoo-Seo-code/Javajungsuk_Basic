package ch07;

final public class Final {	//확장이 될 수 없는 클래스 즉, 조상이 될 수 없는 클래스
	
	final int math() {	//더 이상 오버라이딩 할 수 없는 메소드이다.
		final int MAX = 10;	//값을 변경할 수 없는 변수, 상수이다.
		return MAX;
	}
	public static void main(String[] args) {
		
		Final f = new Final();
		int num = f.math();
		System.out.println(num);
	}

}

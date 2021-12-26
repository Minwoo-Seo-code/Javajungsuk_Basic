package ch07;

public class polumorphism {

	public static void main(String[] args) {
		
		
		//다형성(polymorphism)
		
		/*
		 * 다형성을 이용해
		 * 조상 타입이 자손 타입의 객체를 생성할 수 있다.
		 * 
		 * */

		TV1 tv = new SmartTV1(); // 허용, 부모님 자식의 타입 객체를 생성할 수 있다.
//		SmartTV1 smtv = new TV();	//에러, 자식은 부모 타입의 객체를 생성할 수 없다.
	}

}
class TV1 {
	
}
class SmartTV1 extends TV1 {
	
}

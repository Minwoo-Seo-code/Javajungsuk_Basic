package ch06;

public class Car2 {
	
	String color;
	int tire;
	boolean goodQuality;
	
	public Car2(String color, int tire, boolean goodQuality) {
		//참조변수 this는 다른 매개변수와 이름만으로는 구분하기 힘들어서 사용한다.
		this.color = color;
		this.tire = tire;
		this.goodQuality = goodQuality;
	}
	
	Car2() {
		this("while", 4, true);	//this를 사용함으로서 코드를 줄일 수 있다.
	}
	
	
	public static void main(String[] args) {
		
		Car2 c2 = new Car2("white", 2, false);
		
		System.out.println(c2.color);
			
	}
}
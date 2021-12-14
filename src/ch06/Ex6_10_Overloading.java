package ch06;

public class Ex6_10_Overloading {

	//Overloading이란 같은 이름의 메소드를 사용하는 것이다.
	/*
	 * 조건으로는 매개변수 타입이 다르거나, 매개변수 갯수가 달라야 한다.
	 * */
	int add(int a, int b) {	
		System.out.println(a+b);
		return a+b;
	}
	
	long add(long a, long b) {
		System.out.println(a+b);
		return a+b;
	}
	
	public static void main(String[] args) {
		
		Ex6_10_Overloading mm = new Ex6_10_Overloading();
		
		int a = 0;
		int b = 10;
		long c = 10;
		long d = 20;
		
		mm.add(a, b);
		mm.add(c, d);
	}
}
package ch06;

public class Ex6_6 {

	public static void main(String[] args) {
		
		int a = 10; 
		int b = 20;
		MyMath mm = new MyMath();
		int result = mm.add(a, b);
		
		System.out.println(result);
	}

}
	class MyMath {
		int add (int a, int b) {
			int result = a + b;
			return result;
		}
	}
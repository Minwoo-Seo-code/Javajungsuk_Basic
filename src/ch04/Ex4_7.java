package ch04;

public class Ex4_7 {

	public static void main(String[] args) {
	
		//Math.random();
		
		for (int i = 1; i <= 5; i++) {
			System.out.println((int)(Math.random()* 10));
		}
		System.out.println("---------");
		for (int i = 0; i < 10; i++) {
			System.out.println((int)(Math.random() * 11) -5);
		}
		
	}
}

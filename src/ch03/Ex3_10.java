package ch03;

public class Ex3_10 {

	public static void main(String[] args) {

		long a = 1_000_000 * 1_000_000;
		long b = 1_000_000 * 1_000_000L;	//L 또는 (long)을 붙여줘야 한다.
		
		System.out.println(a);
		System.out.println(b);
	}
}

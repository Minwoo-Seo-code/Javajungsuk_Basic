package ch02;

public class ScanfEx1 {

	public static void main(String[] args) {
		
		int score1 = 100;
		score1 = 200;
		System.out.printf("%d\n", score1);
		
		final int score2 = 100;
//		score2 = 200;
		System.out.printf("%d", score2);
	}
}

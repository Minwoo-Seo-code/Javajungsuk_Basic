package ch06;

public class MathClass {

	public void guguDan(int num) {
		if (!(num >= 2 && num <= 9)) {
			return;
		}
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d\n", num, i, num *i);
		}
	}
	public int add (int a, int b) {
		int num = 0;
		num = a + b;

		return num;
	}
	
}

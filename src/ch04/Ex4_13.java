package ch04;

public class Ex4_13 {

	public static void main(String[] args) {
	
		//While문
		int sum = 0;
		int num = 0;
		
		while(sum <= 100) {
			System.out.printf("%d - %d\n", num, sum);
			sum += num;
			num++;
		} // while end 
	}
}

package ch04;

import java.util.Scanner;

public class Ex4_14 {

	public static void main(String[] args) {
		
		int num = 0;
		int sum = 0;
		
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		while(num != 0) {
			sum += num%10;
			System.out.printf("sum = %2d num = %d\n", sum, num);
			num /= 10;
		}
		System.out.println("각 자리의 합 = " + sum);
	}
}
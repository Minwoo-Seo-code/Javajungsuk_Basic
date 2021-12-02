package ch02;

import java.util.Scanner;

public class EX2_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println(num);
		System.out.println(num2);
		
		String first = num + "";
		System.out.println("first : " + first);
		
		int chNum = Integer.parseInt(first);
		System.out.println("chNum : " + chNum);
	}
}

package ch04;

import java.util.Scanner;

public class Ex4_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		
		if (score > 60) {
			System.out.println("합격입니다.");
		} else {
			System.out.println("탈락입니다.");
		}
	}
}

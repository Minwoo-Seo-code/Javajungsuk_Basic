package ch04;

import java.util.Scanner;

public class Ex4_4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.printf("%s", "점수를 입력하세요. >");
		int score = sc.nextInt();
		char grade = ' ';
		
		if (score >= 85) {
			grade = 'A';
		} else if(score >= 75) {
			grade = 'B';
		} else if(score >= 65) {
			grade = 'C';
		} else {
			grade = 'D';
		}
		
		System.out.println("점수는 " + score + "이고, 학점은 " + grade + " 입니다.");
	}
}

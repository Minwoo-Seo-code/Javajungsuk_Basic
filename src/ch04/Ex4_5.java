package ch04;

import java.util.Scanner;

public class Ex4_5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.printf("%s", "점수를 입력하세요. >");
		int score = sc.nextInt();
		char grade = ' ';
		char opt = ' ';
		if (score >= 85) {
			if (score >= 95) {
				opt = '+';
			}else if(score <= 90){
				opt = '-';
			}
			grade = 'A';
		} else if(score >= 75) {
			if (score >= 80) {
				opt = '+';
			}else if(score <= 79){
				opt = '-';
			}
			grade = 'B';
		} else if(score >= 65) {
			if (score >= 69) {
				opt = '+';
			}else if(score <= 60){
				opt = '-';
			}
			grade = 'C';
		} else {
			grade = 'D';
		}
		
		System.out.println("점수는 " + score + "이고, 학점은 " + opt + grade + " 입니다.");
	}
}

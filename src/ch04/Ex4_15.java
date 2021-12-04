package ch04;

import java.util.Scanner;

public class Ex4_15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int answer = (int)(Math.random()*100);
		int num = 0;
		do {
			System.out.print("1과 100 사이의 정수를 입력하세요.>");
			num = sc.nextInt();
			
			if (num > answer) {
				System.out.println("더 작은 수를 넣어보세요.");
			} else if (num < answer){
				System.out.println("더 큰 수를 넣어보세요.");
			}
			
		} while (num != answer);
		
		System.out.println("정답입니다.");
	}
}
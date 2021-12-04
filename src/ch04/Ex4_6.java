package ch04;

import java.util.Scanner;

public class Ex4_6 {

	public static void main(String[] args) {
	
		//Switch문 
		//switch문 제약조건 : 조건식 결과는 정수 또는 문자열이어야 한다.
		//case문의 값은 정수, 상수, 문자만 가능하다.
		
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		
		switch(month) {
			case 3 : case 4 : case 5 :
				System.out.println("봄");
				break;
			case 6 : case 7 : case 8 : 
				System.out.println("여름");
				break;
			case 9 : case 10 : case 11 : 
				System.out.println("가을");
				break;	
			case 12 : case 1 : case 2 : 
				System.out.println("겨울");
				break;	
			default :
				System.out.println("잘못입력하셨습니다.");
		}
	}
}

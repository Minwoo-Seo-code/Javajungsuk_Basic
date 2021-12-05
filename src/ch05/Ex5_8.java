package ch05;

import java.util.Arrays;
import java.util.Scanner;

public class Ex5_8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String[] name = new String[3];
		
		for (int i = 0; i < name.length; i++) {
			name[i] = sc.next();
			System.out.println("계속 입력하세요.");
		}
		System.out.println(Arrays.toString(name));
	}
}

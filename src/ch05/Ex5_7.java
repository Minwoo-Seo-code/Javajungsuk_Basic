package ch05;

import java.util.Arrays;

public class Ex5_7 {

	public static void main(String[] args) {
		int random = 0;
		String[] name = {"Hello", "Egoing", "James"};
		System.out.println(name); // 배열의 주소가 출력이 된다.
		
		System.out.println(Arrays.toString(name));	//[Hello, Egoing, James]
		
		for (int i = 0; i < name.length; i++) {
			random = (int)(Math.random()*3);
		}
		System.out.println(name[random]);
	}
}

package ch05;

import java.util.Arrays;

public class Ex5_3 {

	public static void main(String[] args) {
		
		int[] arr = {10, 20, 30, 40};
		
		System.out.println(arr);	// [I@182decdb : 배열의 주소를 알려준다.
		//1번 출력방법
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		//2번 출력방법 Arrays클래스 사용한다.
		System.out.println(Arrays.toString(arr));
		
		//예외적으로 char배열은 출력이 된다.
		char[] str = {'a', 'b', 'c', 'd'};
		System.out.println(str);	//abcd
		
	}
}

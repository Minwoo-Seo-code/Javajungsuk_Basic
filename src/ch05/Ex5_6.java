package ch05;

import java.util.Arrays;

public class Ex5_6 {

	public static void main(String[] args) {
		
		int[] arr = {0,1,2,3,4,5,6,7,8,9};
		
		for (int i = 0; i < arr.length; i++) {
			int n = (int)(Math.random()*10);
			int tmp = arr[0];
			arr[0] = arr[n];
			arr[n] = tmp;
		}
		System.out.println(Arrays.toString(arr));
		
	}
}
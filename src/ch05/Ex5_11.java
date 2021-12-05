package ch05;

import java.util.Arrays;

public class Ex5_11 {

	public static void main(String[] args) {
		
		int[] arr = {0,1,2,3,4,5};
		int[][] arr2D = {
						{1,2,3},
						{4,5,6},
						{7,8,9}
						};
		System.out.println(Arrays.toString(arr));	//[0, 1, 2, 3, 4, 5]
		//2차원 배열 toString 메소드
		System.out.println(Arrays.deepToString(arr2D));//[[1, 2, 3], [4, 5, 6], [7, 8, 9]]
	
		//배열 복제
		int[] arr2 = Arrays.copyOf(arr, arr.length);
		System.out.println(Arrays.toString(arr2));//[0, 1, 2, 3, 4, 5]
		
		int[] arr3 = Arrays.copyOf(arr, 3); //index(3) 번까지 복사
		System.out.println(Arrays.toString(arr3));//[0, 1, 2]
		
		//배열 정렬
		int numArr[] = {2,3,1,5,7};
		Arrays.sort(numArr);
		System.out.println(Arrays.toString(numArr));//[1, 2, 3, 5, 7]
	}
}

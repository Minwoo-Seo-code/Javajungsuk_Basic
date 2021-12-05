package ch05;

public class Ex5_9 {

	public static void main(String[] args) {
		
		//2차원 배열
		int[][] score = new int[4][3];	//4행, 3열
		
		int sum = 0;
		int[][] arr = {
						{1,2,3},
						{4,5,6},
						{7,8,9},
						{10,11,12}
					};
		for (int i = 0; i < arr.length; i++) {	//4
			for (int j = 0; j < arr[i].length; j++) {	//arr[i].length = 3
				System.out.printf("arr[%d][%d] = %d\n", i, j, arr[i][j]);
				sum += arr[i][j];
			}
		}
		System.out.println(sum);
	}
}

package ch05;

public class Ex5_4 {

	public static void main(String[] args) {
		
		int sum = 0;
		int[] arr = {30, 40, 50, 60, 70};
		
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		
		double avg = (double)sum/arr.length;
		System.out.println(sum);
		System.out.println(avg);
	}
}

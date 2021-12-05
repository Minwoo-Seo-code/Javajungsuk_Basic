package ch05;


public class Ex5_2 {

	public static void main(String[] args) {
		
		//배열은 한번 생성하면 그 길이를 바꿀 수 없다.
		//그래서 배열.length는 "상수"이다.
		int[] arr = new int[5];
		int tmp = arr.length;
		
		System.out.println(tmp);
		System.out.println("---------");
		
		int[] score = new int[5];
		for(int i = 0; i < score.length; i++) {
			System.out.println("score["+ i + "] = "+ score[i]);
		}
		
	}
}

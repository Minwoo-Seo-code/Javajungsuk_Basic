package ch06;

public class Ex6_7 {

	public static void main(String[] args) {
		
		int num = 8;
		MathClass mc = new MathClass();
		mc.guguDan(num);	//11 넣으면 return으로 처리
		
		int a = 10; 
		int b = 20;
		System.out.println(mc.add(a, b));
	
	}
}
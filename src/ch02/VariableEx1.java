package ch02;

public class VariableEx1 {

	public static void main(String[] args) {
		
		int num = 3;
		String str = num + "";
		
		System.out.println(str);
		
		String str2 = "3";
		int num2 = Integer.parseInt(str2);
		
		System.out.println(num2);
		
		char chr = '3';
		String str3 = chr + "";
		System.out.println(str3);
		
		String str4 = "3";
		char chr2 = str4.charAt(0);
		System.out.println(chr2);
	}
}

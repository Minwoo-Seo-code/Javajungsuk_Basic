package ch07;

public class ProductTest2 {

	public static void main(String[] args) {
		Product p[] = new Product[3];
		
		p[0] = new Computer();
		p[1] = new Radio();
		p[2] = new Audio();
		
		System.out.println(p[0].toString());
		System.out.println(p[1].toString());
		System.out.println(p[2].toString());
	}
}
















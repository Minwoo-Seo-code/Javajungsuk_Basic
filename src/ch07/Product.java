package ch07;

public class Product {
	
	int price;
	int bousePoint;
	
	public Product(int price) {
		this.price = price;
		bousePoint = (int)(price/10.0);
	}
}

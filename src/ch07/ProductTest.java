package ch07;

public class ProductTest {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		b.buy(new Computer());
		System.out.println("현재 남은 돈은 " + b.money + " 입니다.");
		System.out.println("현재 포인트는 " + b.bonusPoint + " 입니다.");
		
		b.buy(new Radio());
		System.out.println("현재 남은 돈은 " + b.money + " 입니다.");
		System.out.println("현재 포인트는 " + b.bonusPoint + " 입니다.");
		
		b.buy(new Audio());
		System.out.println("현재 남은 돈은 " + b.money + " 입니다.");
		System.out.println("현재 포인트는 " + b.bonusPoint + " 입니다.");
	}
}

class Buyer {
	int money = 100000;
	int bonusPoint = 0;
	
	void buy(Product p) {
		if (money <= 0) { System.out.println("제품을 구매할 수 없습니다."); return; }
		
		money -= p.price;
		bonusPoint += p.bousePoint;
		System.out.println(p + "를 구매하셨습니다.");
	}
}
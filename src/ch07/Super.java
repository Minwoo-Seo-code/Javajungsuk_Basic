package ch07;

class Top {
	int x = 10;
}
class Bottom extends Top{
	int x = 20;
	
	void change() {
		System.out.println("this.x = " + this.x);	//매개변수가 부모와 자식의 것이 같을 때
		System.out.println("super.x = " + super.x);	//구분하기 위해서 this와 super를 사용한다.
													//Super는 조상의 것, this는 지금 메소드를 호출하는 객체의 것
	}
}
public class Super {

	public static void main(String[] args) {
		Bottom btm = new Bottom();
		btm.change();
	}

}

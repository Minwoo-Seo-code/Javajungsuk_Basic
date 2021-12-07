package ch06;

public class Ex6_2 {

	public static void main(String[] args) {
		
		TV tv1, tv2, tv3;
		// ==
		TV[] tvArr = new TV[3];	//객체 배열
		tvArr[0] = new TV();	//객체 배열의 주소는 index[0]의 주소와 같다 왜냐하면
		tvArr[1] = new TV();	//배열의 주소값을 알아야 찾을 수 있기 때문에
		tvArr[2] = new TV();
		
		//객체 배열을 생성했더라고 각 인덱스당 객체를 생성해줘야 한다.
	}

}

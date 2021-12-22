package ch07;

public class Override {
	
	public static void main(String[] args) {
		MyPoint mp = new MyPoint();
		mp.x = 20;
		mp.y = 10;
		mp.z = 10;
		
		String sum = mp.getLocation();
		System.out.println(sum);
		
	}
	
}
class point {
	int x;
	int y;
	
	String getLocation() {
		return "x : " + x + "y : " + y;
	}
}

class MyPoint extends point{
	int z;
	
	String getLocation() {
		return "x : " + x + " y : " + y + " z : " + z;
	}
}


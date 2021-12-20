package ch07;

public class Composition_Point {
	
	Point pnt = new Point();
	int z;
	
	public static void main(String[] args) {
		
		Composition_Point cp = new Composition_Point();
		
		cp.pnt.x = 10;
		cp.pnt.y = 20;
		cp.z = 30;
		
		System.out.println("cp.pnt.x = " + cp.pnt.x);
		System.out.println("cp.pnt.y = " + cp.pnt.y);
		System.out.println("cp.z = " + cp.z);
		
	}

}

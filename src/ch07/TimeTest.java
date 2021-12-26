package ch07;

class Time {	//캡슐화의 접근 제어자
	private int hour;	//0~23
	private int minute;	//0~59
	private int second;	//0~59 까지만 사용할 수 있는데 외부에서 범위 이외의 수를 넣을 수 있기때문에
						//접근제어자를 사용해 외부에서 수정하는 것을 방지한다.
	
	public void setHour(int hour) {
		if (0 > hour || hour > 23) {
			System.out.println("Hour Not Available");
			return;
		}
		this.hour = hour;
		System.out.println(hour);
	}
	
	public void setMinute(int min) {
		if (0 > min || min > 59) {
			System.out.println("Minute Not Available");
			return;
		}
		this.minute = min;
		System.out.println(min);
	}
	
	public void setSecond(int sec) {
		if (0 > sec || sec > 59) {
			System.out.println("Second Not Available");
			return;
		}
		this.second = sec;
		System.out.println(sec);
	}
	
}

public class TimeTest {

	public static void main(String[] args) {

		Time t = new Time();
		t.setHour(23);
		t.setMinute(59);
		t.setSecond(59);
		
		Time t1 = new Time();
		t1.setHour(24);
		t1.setMinute(60);
		t1.setSecond(60);
	}

}

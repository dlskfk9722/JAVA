package java13;

public class Day {
	String doing;
	int time;
	String location;
	static int count;//전역변수는 자동초기화가 된다.
	static int sum;//전역변수는 자동초기화가 된다.
	
	//static메소드는 static변수만 쑬 수 있다.
	public static int avgTime() {
		return sum/count;
	}
	
	public Day(String doing, int time, String location) {
		sum=sum+time;
		count++;
		this.doing = doing;
		this.time = time;
		this.location = location;
	}

	@Override
	public String toString() {
		return "Day [doing=" + doing + ", time=" + time + ", location=" + location + "]";
	}
	
	

}

package newPack;

import java09.Cal;

public class Myshop {

	public static void main(String[] args) {
		Cal cal=new Cal();
		System.out.println(cal.call());
		cal.add(200, 100);//접근제어자가 default이면 실행이 불가능하다.
	}

}

package switchTest;

import java.util.Date;


public class SwitchTest3 {

	public static void main(String[] args) {
		Date date = new Date ();
		int month=date.getMonth()+1;//getmonth의 기능=>month를 알려준다.
		
		System.out.println("이번달은"+(month));
		switch (month) {
		case 2: 
			System.out.println("28일까지 있는 달입니다.");
			break;
		case 4: case 6: case 9: case 11:
			System.out.println("30일까지 있는 달입니다");
			break;
		default:
			System.out.println("31일까지 있는 달입니다.");
			
		}
	
		}
}
 
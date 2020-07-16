package switchTest;

import java.util.Date;


public class SwitchTest4 {

	public static void main(String[] args) {
		Date date = new Date ();
		int month=date.getMonth()+1;//getmonth의 기능=>month를 알려준다.
		
		System.out.println("이번달은"+(month));
		switch (month) {//실수x,정수(long)x
		case 3: case 4: case 5:
			System.out.println("지금은 봄입니다.");
			break;
		case 6: case 7: case 8:
			System.out.println("지금은 여름입니다.");
			break;
		case 9: case 10: case 11:
			System.out.println("지금은 가을입니다.");
			break;
		default:
			System.out.println("지금은 겨울입니다.");
		}
		
		}
}

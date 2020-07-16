package control;
import java.lang.*; 
import java.util.Date;

public class ObjectTest {

	public static void main(String[] args) {
		Date date=new Date();
		int hour=date.getHours();
		int min=date.getMinutes();
		int sec=date.getSeconds();
		
		int year=date.getYear();
		int mon=date.getMonth();
		int day=date.getDay();
		
		System.out.println("현재 몇시인가요?"+hour);
		System.out.println("현재 몇분인가요?"+min);
		System.out.println("현재 몇초인가요?"+sec);
		System.out.println("현재 몇년인가요?"+year);
		System.out.println("현재 무슨달인가요?"+mon);
		System.out.println("현재 몇요일인가요?"+day);
		System.out.println();
		System.out.println(date.getDay());
		System.out.println(date.getMonth()+1);
		System.out.println(date.getYear()+1900);
	}

}

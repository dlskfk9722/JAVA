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
		
		System.out.println("���� ����ΰ���?"+hour);
		System.out.println("���� ����ΰ���?"+min);
		System.out.println("���� �����ΰ���?"+sec);
		System.out.println("���� ����ΰ���?"+year);
		System.out.println("���� �������ΰ���?"+mon);
		System.out.println("���� ������ΰ���?"+day);
		System.out.println();
		System.out.println(date.getDay());
		System.out.println(date.getMonth()+1);
		System.out.println(date.getYear()+1900);
	}

}

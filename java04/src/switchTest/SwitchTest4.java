package switchTest;

import java.util.Date;


public class SwitchTest4 {

	public static void main(String[] args) {
		Date date = new Date ();
		int month=date.getMonth()+1;//getmonth�� ���=>month�� �˷��ش�.
		
		System.out.println("�̹�����"+(month));
		switch (month) {//�Ǽ�x,����(long)x
		case 3: case 4: case 5:
			System.out.println("������ ���Դϴ�.");
			break;
		case 6: case 7: case 8:
			System.out.println("������ �����Դϴ�.");
			break;
		case 9: case 10: case 11:
			System.out.println("������ �����Դϴ�.");
			break;
		default:
			System.out.println("������ �ܿ��Դϴ�.");
		}
		
		}
}

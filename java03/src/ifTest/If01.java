package ifTest;

import java.util.Date;

public class If01 {

	public static void main(String[] args) {
		// ���� �ð��� �����ϱ�? �����ϱ�? �����ϱ�?�Ǵ�
		Date date=new Date();
		//��Ʈ��+����Ʈ+o(������)=>�ڵ� import
		
		int hour=date.getHours();
		if(hour<12) {
			System.out.println("�����̱���!!!");
			}
		else if(hour<18) {
			System.out.println("�����̱���!!!");
			}
		else {
			System.out.println("�����̱���!!!");
			}
		}
	}
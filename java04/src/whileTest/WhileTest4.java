package whileTest;

import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class WhileTest4 {

	public static void main(String[] args) {
		
		Date date=new Date();
		Scanner sc=new Scanner(System.in);
		System.out.println("-------------------");
		System.out.print("������ �����?");
		int tem=sc.nextInt();
		System.out.print("���� ���� �򰡴�?");
		String grade=sc.next();
		System.out.print("���� �Ź� �������?");
		double size=sc.nextDouble();
		System.out.println("-------------------");
		System.out.println("������"+tem+"��"+",���� �򰡴�"+grade+",�Ź���"+size);
		
		System.out.println();
		
		System.out.print("ù��° ���� �Է��ϼ���:");
		int num1=sc.nextInt();
		System.out.print("�ι�° ���� �Է��ϼ���:");
		int num2=sc.nextInt();
		
		if(num1==num2) {
			System.out.println("�μ��� �����ϴ�.");
		}else {
			System.out.println("�μ��� �ٸ��ϴ�.");
		}
		
	}

}

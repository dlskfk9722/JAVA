package array;

import java.util.Scanner;

public class ArrayTest6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//3���� �� �л��� ����,���� �����Դϴ�.
		//����:
		//����:
		//������ ��� ������ ������ ��� ������ ����Ʈ
		
		String[]name=new String[3];
		int[] eng=new int[3];
		int[] math=new int[3];
		
		//1.3���� �л��鿡 ���� ������ �Է¹ް� �ͽ��ϴ�.
		for (int i = 0; i < 3; i++) {
			//2.�Է�:�̸�+����
			System.out.print("�̸��� �Է��ϼ���:");
			name[i]=sc.next();
			System.out.print("���������� �Է��ϼ���:");
		    eng[i]=sc.nextInt();		   
		    System.out.print("���������� �Է��ϼ���:");
		    math[i]=sc.nextInt();
		}
		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i]+"�� �������� : "+eng[i]+" �������� : "+math[i]);
		}
		//3.��ü �л��� ����� ���� �ͽ��ϴ�.
		int sum=eng[3]+math[3];
		System.out.println("�л����� ��ü �����"+sum/3.0);
		
		
	
	}

}

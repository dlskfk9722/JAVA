package input;

import java.util.Scanner;

public class InputStart4 {

	public static void main(String[] args) {
		//�ּ��� ����Ű:
		//���� �ּ�=> ��Ʈ�� +
		//������ �ּ�=> ��Ʈ��+����Ʈ+/
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("���̸� �Է��ϼ���:");
		int age=sc.nextInt();
	
		
		if(age>=18)
			System.out.println("�����Դϴ�.");
		else
			System.out.println("�̼������Դϴ�.");
			
		
		
		
	}

}

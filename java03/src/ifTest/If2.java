package ifTest;


import java.util.Scanner;

public class If2 {

	public static void main(String[] args) {
		/*
		 * �޴��� ������ 1.¥��� 2.«�� 2.�쵿 
		 * ����� ������?1 
		 * ����� ¥����� �ֹ��ϼ̽��ϴ�.
		 */
		Scanner sc=new Scanner(System.in);
		
		System.out.println("�����!!!");
		System.out.println("-------------------------------");
		System.out.println("�޴��� ������");
		System.out.println("-------------------------------");
		System.out.println("�޴��� ������ 1)¥��� 2)«�� 3)�쵿");
		System.out.println("-------------------------------");
		System.out.print("����� ������?");
		int menu=sc.nextInt();
		System.out.print("�ֹ�������?");
		int count=sc.nextInt();
		
		int jajang=4500;
		int jambong=5000;
		int woodong=5500;
	
		String food=null;
		int price=0;
		
		if(menu==1) {
			food="¥���";
			price=jajang*count;
		}
		else if(menu==2) {
			food="«��";
			price=jambong*count;
		}
		else  {
			food="�쵿";
			price=woodong*count;
		}
		System.out.println("�����"+food+"�� �����ϼ̱���.");
		System.out.println("����� ������ �ݾ���"+price+"���Դϴ�.");
		System.out.println("-------------------------------");
		
		//��ü ������ �ݾ��� �����̻��̸� ��õ�� ����ֱ�
		
		if(price>=10000) {
			price=price-2000;
			System.out.println("�ݾ��� �����̻����� 2000�� �����ؼ� ��"+price+"���Դϴ�.");
		}
		
		/*
		 * if(menu==1) 
		 * { 
		 * System.out.println("����� ¥����� �ֹ��ϼ̽��ϴ�."); 
		 * } 
		 * else if(menu==2) {
		 * System.out.println("����� «���� �ֹ��ϼ̽��ϴ�."); 
		 * } 
		 * else if(menu==3) {
		 * System.out.println("����� �쵿�� �ֹ��ϼ̽��ϴ�."); 
		 * } else {
		 * System.out.println("�߸� �ֹ��ϼ̽��ϴ�."); 
		 * }
		 */
		
		}
	}

package whileTest;

import java.util.Random;
import java.util.Scanner;

public class WhileTest3 {

	public static void main(String[] args) {
	//ctrl+shift+f	
	Random random=new Random();
	
	int target=random.nextInt(100);
	
	Scanner sc=new Scanner(System.in);
	int count=0;//try�� Ƚ��
	
	while(true) {
		System.out.print("������ �����Ͽ� ���ÿ�(1~100)>>>");
		int input=sc.nextInt();
		count++;
		
		if(input==target) {
			System.out.println("�����մϴ�. �����Դϴ�.");
			break;
			
		}else if(input>target) {
				System.out.println("������ ������ �����ϴ�.");
				}
		else {
				System.out.println("������ ������ �����ϴ�.");
			
		}
		
	}
	System.out.println("�õ�Ƚ��:"+count+"ȸ");
	}

}

import java.util.Scanner;

public class ArrayTest6 {

	public static void main(String[] args) {
		
		
		int[]num= {0,10,50,40,20,30};
		int s=50;
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Ž���� ���� �Է��ϼ���: ");
		int input=sc.nextInt();
		
		
		
		for (int i = 0; i < num.length; i++) {
			if(num[i]==s) {
				System.out.println("50���� "+(i+1)+"��ġ�� �ֽ��ϴ�.");
				
			}
		}
	
	}

}

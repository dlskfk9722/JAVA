package switchTest;


import java.util.Scanner;


public class SwitchTest5 {

	public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	
	//String input=sc.nextLine();//String,,한줄을 다 갖고싶을때,,?
	//int input2=sc.nextInt();//int<-String
	//double input3=sc.nextDouble();//double<-String
	//boolean input4=sc.nextBoolean();//boolean<-String
	
	System.out.print("입력하세요..>>");	
	String input1=sc.next();//String
	
	char c=input1.charAt(0);//첫번째 글자 추출
	System.out.println("첫 번째 글자는??"+c);
	

	}
}

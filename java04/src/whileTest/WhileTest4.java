package whileTest;

import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class WhileTest4 {

	public static void main(String[] args) {
		
		Date date=new Date();
		Scanner sc=new Scanner(System.in);
		System.out.println("-------------------");
		System.out.print("오늘의 기온은?");
		int tem=sc.nextInt();
		System.out.print("오늘 나의 평가는?");
		String grade=sc.next();
		System.out.print("나의 신발 사이즈는?");
		double size=sc.nextDouble();
		System.out.println("-------------------");
		System.out.println("오늘은"+tem+"도"+",나의 평가는"+grade+",신발은"+size);
		
		System.out.println();
		
		System.out.print("첫번째 수를 입력하세요:");
		int num1=sc.nextInt();
		System.out.print("두번째 수를 입력하세요:");
		int num2=sc.nextInt();
		
		if(num1==num2) {
			System.out.println("두수가 같습니다.");
		}else {
			System.out.println("두수가 다릅니다.");
		}
		
	}

}

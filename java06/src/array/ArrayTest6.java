package array;

import java.util.Scanner;

public class ArrayTest6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//3명의 각 학생의 영어,수학 점수입니다.
		//영어:
		//수학:
		//영어의 평균 점수와 수학의 평균 점수를 프린트
		
		String[]name=new String[3];
		int[] eng=new int[3];
		int[] math=new int[3];
		
		//1.3명의 학생들에 대한 성적을 입력받고 싶습니다.
		for (int i = 0; i < 3; i++) {
			//2.입력:이름+점수
			System.out.print("이름을 입력하세요:");
			name[i]=sc.next();
			System.out.print("영어점수를 입력하세요:");
		    eng[i]=sc.nextInt();		   
		    System.out.print("수학점수를 입력하세요:");
		    math[i]=sc.nextInt();
		}
		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i]+"의 영어점수 : "+eng[i]+" 수학점수 : "+math[i]);
		}
		//3.전체 학생의 평균을 내고 싶습니다.
		int sum=eng[3]+math[3];
		System.out.println("학생들의 전체 평균은"+sum/3.0);
		
		
	
	}

}

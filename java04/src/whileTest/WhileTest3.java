package whileTest;

import java.util.Random;
import java.util.Scanner;

public class WhileTest3 {

	public static void main(String[] args) {
	//ctrl+shift+f	
	Random random=new Random();
	
	int target=random.nextInt(100);
	
	Scanner sc=new Scanner(System.in);
	int count=0;//try한 횟수
	
	while(true) {
		System.out.print("정답을 추측하여 보시오(1~100)>>>");
		int input=sc.nextInt();
		count++;
		
		if(input==target) {
			System.out.println("축하합니다. 정답입니다.");
			break;
			
		}else if(input>target) {
				System.out.println("제시한 정수가 높습니다.");
				}
		else {
				System.out.println("제시한 정수가 낮습니다.");
			
		}
		
	}
	System.out.println("시도횟수:"+count+"회");
	}

}

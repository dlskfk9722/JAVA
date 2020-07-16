import java.util.Arrays;
import java.util.Scanner;

public class ArrayTest7 {

	public static void main(String[] args) {
		
		
		int[]num= {44,77,22,33,99,11};
		Arrays.sort(num);
		
		for (int i = 0; i < num.length; i++) {
			if(num[i]==22) {
				System.out.println(i+1+"µî");
				
			}
		}
	
	}

}

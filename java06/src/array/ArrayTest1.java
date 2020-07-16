package array;

public class ArrayTest1 {

	public static void main(String[] args) {
		int[] s=new int[10];//new는 복사의 의미
		int[] s2;//선언=>메모리 확보
		s2=new int[10];
		
		System.out.println("s변수에 들어있는것은??"+s);
		System.out.println(s[0]);//첫번째 s의 값
		                         //[]는 배열
		                         //[위치값,index]

	}

}

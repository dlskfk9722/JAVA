package java05;

public class ArrayTest2 {

	public static void main(String[] args) {
		String[]friends= {"이나라","강윤지","김세연"};
		System.out.println(friends.length);
		
		
		for (String f : friends) {
			System.out.println(f);
		}//단점:위치값을 적어야 할때는 쓰이지 못한다.
		System.out.println();
		
		for (int i = 0; i < friends.length; i++) {
			System.out.println(friends[i]);
		}
		
		

	}

}

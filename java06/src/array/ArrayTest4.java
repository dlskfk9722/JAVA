package array;

public class ArrayTest4 {

	public static void main(String[] args) {
	
		String[] grade= {"A","B","C","D","F"};
		String[] names= {"이정남","김선미","이나라","이시현","이이이"};
		
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]+"성적 : "+grade[i]);
			
		}
		
	
	}

}

package java05;

public class ArrayTest2 {

	public static void main(String[] args) {
		String[]friends= {"�̳���","������","�輼��"};
		System.out.println(friends.length);
		
		
		for (String f : friends) {
			System.out.println(f);
		}//����:��ġ���� ����� �Ҷ��� ������ ���Ѵ�.
		System.out.println();
		
		for (int i = 0; i < friends.length; i++) {
			System.out.println(friends[i]);
		}
		
		

	}

}

package array;

public class ArrayTest3 {

	public static void main(String[] args) {
	
		double[]eyes= {2,1.5,0.8,0.5,1.2};
		System.out.println(eyes.length);
		eyes[0]=1.7;
		System.out.println();
		for (double d : eyes) {//for-each��
			System.out.println(d);
			
		}
		System.out.println();
		String[] names= {"������","�輱��","�̳���","�̽���","������"};
		
		for (int i = 0; i < eyes.length; i++) {
			System.out.println(names[i]+":"+eyes[i]);
		}
	
	}

}

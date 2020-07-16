
public class ArrayTest2 {

	public static void main(String[] args) {
		int[][]seat=new int[2][5];//2행5열
	
		System.out.println(seat.length);
		System.out.println(seat[0].length);
		
        //i=행(2번)
		System.out.println("------------------");
		for (int i = 0; i < seat.length; i++) {
			for (int j = 0; j < seat[i].length; j++) {
				System.out.print(seat[i][j]+" ");				
			}
			System.out.println();
		}
	}

}

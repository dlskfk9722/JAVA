import java.util.Scanner;

public class ArrayTest3 {

	public static void main(String[] args) {

		int[][] seat = new int[2][5];// 2행5열

		System.out.println("      <<영화 예매 프로그램>>");
		while (true) {
			System.out.println();

			for (int i = 0; i < 5; i++) {
				System.out.print("   " + i + "열" + "  ");
			}
			System.out.println();
			System.out.println("-------------------------");
			for (int i = 0; i < seat.length; i++) {
				System.out.print(i + "행:");
				for (int j = 0; j < seat[i].length; j++) {
					System.out.print(seat[i][j] + "    ");
				}
				System.out.println();
			}
			System.out.println("-------------------------");

			Scanner sc = new Scanner(System.in);
			System.out.print("종료:x 예매:y>>>");
			String input=sc.next();
			if(input.equals("x")) {
				System.out.println("예매시스템을 종료합니다.");
				break;
			}else {
			System.out.print("예매행을 입력:");
			int row = sc.nextInt();
			System.out.print("예매열을 입력:");
			int col = sc.nextInt();

			if (seat[row][col] == 0) {
				seat[row][col] = 1;
				System.out.println("요청하신 자리에서 예매가 완료되었습니다.");
			} else {
				System.out.println("이미 예매가 완료되었습니다.");
				System.out.println("다른 좌석을 선택해 주세요");
			}
		}
		}
	}

}

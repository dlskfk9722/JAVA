import java.util.Scanner;

public class ArrayTest3 {

	public static void main(String[] args) {

		int[][] seat = new int[2][5];// 2��5��

		System.out.println("      <<��ȭ ���� ���α׷�>>");
		while (true) {
			System.out.println();

			for (int i = 0; i < 5; i++) {
				System.out.print("   " + i + "��" + "  ");
			}
			System.out.println();
			System.out.println("-------------------------");
			for (int i = 0; i < seat.length; i++) {
				System.out.print(i + "��:");
				for (int j = 0; j < seat[i].length; j++) {
					System.out.print(seat[i][j] + "    ");
				}
				System.out.println();
			}
			System.out.println("-------------------------");

			Scanner sc = new Scanner(System.in);
			System.out.print("����:x ����:y>>>");
			String input=sc.next();
			if(input.equals("x")) {
				System.out.println("���Žý����� �����մϴ�.");
				break;
			}else {
			System.out.print("�������� �Է�:");
			int row = sc.nextInt();
			System.out.print("���ſ��� �Է�:");
			int col = sc.nextInt();

			if (seat[row][col] == 0) {
				seat[row][col] = 1;
				System.out.println("��û�Ͻ� �ڸ����� ���Ű� �Ϸ�Ǿ����ϴ�.");
			} else {
				System.out.println("�̹� ���Ű� �Ϸ�Ǿ����ϴ�.");
				System.out.println("�ٸ� �¼��� ������ �ּ���");
			}
		}
		}
	}

}

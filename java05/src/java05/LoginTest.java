package java05;

import javax.swing.JOptionPane;

public class LoginTest {

	public static void main(String[] args) {
		String id2="root";
		String pw2="abcd";
		
		String id=JOptionPane.showInputDialog("ID �Է�");
		String pw=JOptionPane.showInputDialog("PW �Է�");

		if(id.equals(id2)&&pw.contentEquals(pw2)) {
			System.out.println("�α��� OK");
		}else {
			System.out.println("�α��� NOT");
			
		}
	}

}

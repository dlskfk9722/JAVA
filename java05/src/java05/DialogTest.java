package java05;

import javax.swing.JOptionPane;

public class DialogTest {

	public static void main(String[] args) {
		//입력은 다이얼로그
		String name=JOptionPane.showInputDialog("당신의 이름은:");
		String age=JOptionPane.showInputDialog("당신의 나이는:");
		String par=JOptionPane.showInputDialog("당신의 소속은:");
		//출력은 콘솔
		System.out.println("당신의 이름은:"+name);
		System.out.println("당신의 나이는:"+age);
		System.out.println("당신의 소속은:"+par);
		
		
		

	}

}

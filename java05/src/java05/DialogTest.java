package java05;

import javax.swing.JOptionPane;

public class DialogTest {

	public static void main(String[] args) {
		//�Է��� ���̾�α�
		String name=JOptionPane.showInputDialog("����� �̸���:");
		String age=JOptionPane.showInputDialog("����� ���̴�:");
		String par=JOptionPane.showInputDialog("����� �Ҽ���:");
		//����� �ܼ�
		System.out.println("����� �̸���:"+name);
		System.out.println("����� ���̴�:"+age);
		System.out.println("����� �Ҽ���:"+par);
		
		
		

	}

}

package java05;

import javax.swing.JOptionPane;

public class CalTest {

	public static void main(String[] args) {
		String num1=JOptionPane.showInputDialog("����1�Է�");
		String num2=JOptionPane.showInputDialog("����2�Է�");
		
		int n1=Integer.parseInt(num1);
		int n2=Integer.parseInt(num2);
		
		JOptionPane.showMessageDialog(null,n1+n2);//��ȯ���� ����(return�� ����.void)
		int result=JOptionPane.showConfirmDialog(null,n1+n2);//��ȯ���� ����(return�� �ִ�.)
		//void�� ��ȯ���� ���ٴ� ���̴�.
		System.out.println(result);
		
		
		
	}

}
package java05;

import javax.swing.JOptionPane;

public class CalTest {

	public static void main(String[] args) {
		String num1=JOptionPane.showInputDialog("숫자1입력");
		String num2=JOptionPane.showInputDialog("숫자2입력");
		
		int n1=Integer.parseInt(num1);
		int n2=Integer.parseInt(num2);
		
		JOptionPane.showMessageDialog(null,n1+n2);//반환값이 없음(return이 없다.void)
		int result=JOptionPane.showConfirmDialog(null,n1+n2);//반환값이 있음(return이 있다.)
		//void는 반환값이 없다는 뜻이다.
		System.out.println(result);
		
		
		
	}

}

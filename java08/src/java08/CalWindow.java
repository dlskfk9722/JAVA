package java08;

import javax.swing.JFrame;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class CalWindow {
	private static JTextField n1;
	private static JTextField n2;
	private static JTextField result;

	public static void main(String[] args) {
		JFrame f=new JFrame();
		f.getContentPane().setBackground(Color.PINK);
		f.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel = new JLabel("숫자1>>");
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 24));
		lblNewLabel.setForeground(Color.BLACK);
		f.getContentPane().add(lblNewLabel);
		
		n1 = new JTextField();
		n1.setFont(new Font("굴림", Font.PLAIN, 24));
		f.getContentPane().add(n1);
		n1.setColumns(10);
		
		JLabel label = new JLabel("숫자2>>");
		label.setForeground(Color.BLACK);
		label.setFont(new Font("굴림", Font.PLAIN, 24));
		f.getContentPane().add(label);
		
		n2 = new JTextField();
		n2.setFont(new Font("굴림", Font.PLAIN, 24));
		n2.setColumns(10);
		f.getContentPane().add(n2);
		
		JButton add = new JButton("더하기 연산");
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("더하기 버튼을 누르셨군요...");
				String num1=n1.getText();//입력한 값을 가지고 들어오는 것이다.
				String num2=n2.getText();//입력한 값을 가지고 들어오는 것이다.
				System.out.println("입력한 숫자값1: "+num1);
				System.out.println("입력한 숫자값2: "+num2);
				
				int n11 =Integer.parseInt(num1);
				int n22 =Integer.parseInt(num2);
				int sum=n11+n22;
				System.out.println("두 수를 더한 값은: "+sum);
				result.setText(sum+"");
				
			}
		});
		add.setBackground(Color.YELLOW);
		add.setFont(new Font("굴림", Font.PLAIN, 20));
		f.getContentPane().add(add);
		
		JButton minus = new JButton("빼기 연산");
		minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.out.println("빼기 연산을 클릭하셨군요");
				
				String num1=n1.getText();//입력한 값을 가지고 들어오는 것이다.
				String num2=n2.getText();//입력한 값을 가지고 들어오는 것이다.
				System.out.println("입력한 숫자값1: "+num1);
				System.out.println("입력한 숫자값2: "+num2);
				
				int n11 =Integer.parseInt(num1);
				int n22 =Integer.parseInt(num2);
				int tot=n11-n22;
				System.out.println("두 수를 빼한 값은: "+tot);
				result.setText(tot+"");
				
				
				
			}
		});
		minus.setBackground(Color.YELLOW);
		minus.setFont(new Font("굴림", Font.PLAIN, 20));
		f.getContentPane().add(minus);
		
		result = new JTextField();
		result.setBackground(Color.ORANGE);
		result.setForeground(Color.RED);
		result.setFont(new Font("나눔고딕", Font.PLAIN, 27));
		f.getContentPane().add(result);
		result.setColumns(8);
		
		JLabel image = new JLabel("");
		image.setIcon(new ImageIcon("D:\\lnr\\java08\\src\\java08\\cal.jpg"));
		f.getContentPane().add(image);
		f.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\lnr\\java08\\src\\java08\\cal.jpg"));
		f.setTitle("계산기");
		
		f.setSize(316,606);
		f.setVisible(true);

	}

}

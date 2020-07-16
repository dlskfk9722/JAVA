package java13;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Counter {
	static int count;//자동 초기화
	static int sub;
	public static void main(String[] args) {
		//int count=0;
		JFrame f=new JFrame("나의 카운터 프로그램");
		JFrame f2=new JFrame();//기본 생성자
		f.setSize(300,300);
		
		JLabel number=new JLabel("0");
		Font font = new Font("궁서",Font.BOLD,200);
		number.setFont(font);
		
		JButton b1 = new JButton("1 더하기");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count++;
				number.setText(count+"");
				
			}
		});
		JButton b2 = new JButton("0으로 초기화");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JLabel number=new JLabel("0");
			}
		});
		JButton b3 = new JButton("1 빼기");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				--sub;
				number.setText(sub+"");
			}
		});

		b1.setBackground(Color.CYAN);
		b1.setForeground(Color.black);
		b2.setBackground(Color.blue);
		b2.setForeground(Color.black);
		b3.setBackground(Color.green);
		b3.setForeground(Color.black);
		
		
		FlowLayout flow=new FlowLayout();
		f.getContentPane().setLayout(flow);
		
		f.getContentPane().add(b1);
		f.getContentPane().add(b2);
		f.getContentPane().add(b3);
		f.getContentPane().add(number);
		
		f.setVisible(true);
		

	}

}

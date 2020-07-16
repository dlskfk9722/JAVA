package java19;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class MyWindow extends JFrame implements ActionListener {
	JButton b1,b2;
	private JButton b4;
	
	public MyWindow() {
		setTitle("나의 윈도우");
		setSize(400, 400);
		
		getContentPane().setLayout(new FlowLayout());
		
		b1 = new JButton("첫번째버튼");
		b2 = new JButton("두번째버튼");
		b1.setBackground(Color.PINK);
		b1.addActionListener(this);
		
		b1.setFont(new Font("굴림", Font.PLAIN, 45));
		getContentPane().add(b1, BorderLayout.CENTER);
		
		b2.setBackground(Color.ORANGE);
		b2.setFont(new Font("굴림", Font.PLAIN, 45));
		getContentPane().add(b2);
		
		JButton b3 = new JButton("세번째버튼");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("세번째 버튼 클릭되었습니다.");
			}
		});
		b3.setFont(new Font("굴림", Font.PLAIN, 45));
		b3.setBackground(Color.GREEN);
		getContentPane().add(b3);
		
		b4 = new JButton("네번째버튼");
		b4.setFont(new Font("굴림", Font.PLAIN, 45));
		b4.setBackground(Color.CYAN);
		getContentPane().add(b4);
		b2.addActionListener(this);
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("네번째 버튼 클릭되었습니다.");
			}
		});
		

		setVisible(true);
		
	}
	public static void main(String[] args) {
		MyWindow name = new MyWindow();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1) {
		System.out.println("내가 자동 호출됨......");
		}
		if(e.getSource()==b2) {
		System.out.println("나도 자동 호출됨......");
		
	}
}
}


package java10;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;

public class MyShop2 {
	private static JTextField count;
	private static JTextField total;
	static int number=0;//카운트해주는 변수

	public static void main(String[] args) {
		JFrame f=new JFrame();
		f.getContentPane().setBackground(Color.RED);
		f.setTitle("나의 주문 프로그램");
		f.setSize(600, 500);
		f.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel img = new JLabel("");
		
		
		JButton b1 = new JButton("짜장");
		b1.setBackground(Color.ORANGE);
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ImageIcon icon = new ImageIcon("jj.png");
				img.setIcon(icon);
				number++;
				count.setText(number+"");
				total.setText(number*4000+"");
				
				
			}
		});
		b1.setFont(new Font("굴림", Font.PLAIN, 15));
		f.getContentPane().add(b1);
		
		
		
		JButton b2 = new JButton("짬뽕");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon("j.png");
				img.setIcon(icon);
				number++;
				count.setText(number+"");
				total.setText(number*4500+"");
			}
		});
		b2.setBackground(Color.ORANGE);
		b2.setFont(new Font("굴림", Font.PLAIN, 15));
		f.getContentPane().add(b2);
		
		JButton b3 = new JButton("우동");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon("w.png");
				img.setIcon(icon);
				number++;
				count.setText(number+"");
				total.setText(number*4000+"");
			}
		});
		b3.setBackground(Color.ORANGE);
		b3.setFont(new Font("굴림", Font.PLAIN, 15));
		f.getContentPane().add(b3);
		
		JLabel lblNewLabel = new JLabel("개수");
		f.getContentPane().add(lblNewLabel);
		
		count = new JTextField();
		f.getContentPane().add(count);
		count.setColumns(5);
		
		JLabel lblNewLabel_1 = new JLabel("금액");
		f.getContentPane().add(lblNewLabel_1);
		
		total = new JTextField();
		f.getContentPane().add(total);
		total.setColumns(7);
		
		//JLabel img = new JLabel("");
		img.setIcon(new ImageIcon("C:\\Users\\user\\Desktop\\h.PNG"));
		f.getContentPane().add(img);
		f.setVisible(true);

	}

}

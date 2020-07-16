package java09;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.Label;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class MyMovie {

	public static void main(String[] args) {

		JFrame f=new JFrame();
		f.setTitle("나의 영화 앨범");
		f.setSize(300, 600);
		f.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		JLabel label = new JLabel("");
		
		JButton b1 = new JButton("리.포");
		b1.setIcon(null);
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ImageIcon icon=new ImageIcon("littlep.PNG");
				label.setIcon(icon);
				
				
				
			}
		});
		
		label.setIcon(new ImageIcon("C:\\Users\\user\\Desktop\\littlep.PNG"));
		f.getContentPane().add(label);
		f.getContentPane().add(b1);
		
		
		JButton b2 = new JButton("다.만");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//1.다.만의 이미지를 2.라벨에 icon으로 집어 넣는다.
				ImageIcon icon=new ImageIcon("1-1.png");
				label.setIcon(icon);
				
			}
		});
		f.getContentPane().add(b2);
		
		JButton b3 = new JButton("돈");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon=new ImageIcon("money1.png");
				label.setIcon(icon);
			}
		});
		f.getContentPane().add(b3);
		
		f.setVisible(true);
		
	}

}

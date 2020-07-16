package construct;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class Diary {
	
	private JTextField t1;
	private JTextField t2;
	public Diary() {
		JFrame f= new JFrame("일기쓰는 프레임");
		f.getContentPane().setBackground(Color.PINK);
		f.setSize(450, 500);
		f.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel = new JLabel("일기작성날짜  ");
		lblNewLabel.setFont(new Font("나눔고딕", Font.BOLD, 20));
		f.getContentPane().add(lblNewLabel);
		
		t1 = new JTextField();
		t1.setFont(new Font("나눔고딕", Font.BOLD, 20));
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel(" 일기 제목      ");
		lblNewLabel_1.setFont(new Font("나눔고딕", Font.BOLD, 20));
		f.getContentPane().add(lblNewLabel_1);
		
		t2 = new JTextField();
		t2.setFont(new Font("나눔고딕", Font.BOLD, 20));
		f.getContentPane().add(t2);
		t2.setColumns(10);
		
		JLabel label = new JLabel("   <<일기 내용>>            ");
		label.setFont(new Font("나눔고딕", Font.BOLD, 20));
		f.getContentPane().add(label);
		
		JTextArea t3 = new JTextArea();
		t3.setTabSize(10);
		t3.setRows(15);
		t3.setColumns(30);
		f.getContentPane().add(t3);
		
		JButton btnNewButton = new JButton(" 파일을 저장하기");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String date=t1.getText();
				String title=t2.getText();
				String content=t3.getText();
				System.out.println(date);
				System.out.println(title);
				System.out.println(content);
				
				try {
					FileWriter file = new FileWriter(date+".txt");
					file.write(date+"\n");
					file.write(title+"\n");
					file.write(content+"\n");
					file.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});
		btnNewButton.setBackground(Color.ORANGE);
		btnNewButton.setFont(new Font("굴림", Font.PLAIN, 18));
		f.getContentPane().add(btnNewButton);
		
		JButton button = new JButton(" 파일에서 읽기오기");
		button.setBackground(Color.ORANGE);
		button.setFont(new Font("굴림", Font.PLAIN, 18));
		f.getContentPane().add(button);
		f.setVisible(true);
	}

}

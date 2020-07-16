package java20;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class 영화예매프로그램 extends JFrame implements ActionListener{
	JTextField id,title,director,content;//선언은 메모리
	JLabel img;//이미지 넣어주려고 변경
	
	public  영화예매프로그램() {
		setTitle("나의 영화예매프로그램");
		setSize(300, 500);
		setLayout(new FlowLayout());
		 
		JLabel jId=new JLabel("아이디:");
		JLabel jTitle=new JLabel("타이틀:");
		JLabel jDirector=new JLabel("감독:");
		JLabel jContent=new JLabel("내용:");
		JLabel jImg=new JLabel("이미지:");
		
		 id = new JTextField(20);
		 title = new JTextField(20);
		 director = new JTextField(20);
		 content = new JTextField(20);
		 img = new JLabel();
		
		JButton search=new JButton("영화검색");
		
		add(jId);
		add(id);
		add(jTitle);
		add(title);
		add(jDirector);
		add(director);
		add(jContent);
		add(content);
		add(jImg);
		add(img);
		add(search);
		
		search.addActionListener(this);
		
		
		setVisible(true);
		
	}

	public static void main(String[] args) {
		영화예매프로그램 영화 = new 영화예매프로그램();
	}

	@Override
	public void actionPerformed(ActionEvent e1) {
		try {
		String url="jdbc:mysql://localhost:3306/bigdata";
		String user="root";
		String password="1234";
		//1.커넥터 (드라이버) 설정=>import
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1.커넥터 (드라이버) 설정 성공....");
		//2.DB연결
		Connection con=DriverManager.getConnection(url,user,password);
		System.out.println("DB연결  성공....");
		
		//3.SQL문 객체화
		String id2=id.getText();
		
		
		String sql="select*from movie where id=?";
		System.out.println(sql);
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setString(1, id2);
		
		System.out.println("3.sql문 객체화 성공...");
		//4.SQL문 전송
		ResultSet rs=ps.executeQuery();
		System.out.println("4.sql문 전송 성공...");
		
		while(rs.next()) {
			String id3=rs.getString(1);
			String title3=rs.getString(2);
			String director3=rs.getString(3);
			String content3=rs.getString(4);
			String img3=rs.getString(5);
			id.setText(id3);
			title.setText(title3);
			director.setText(director3);
			content.setText(content3);
			ImageIcon icon = new ImageIcon(img3);
			img.setIcon(icon);
			
		}
		
	
		}catch(Exception e) {
			System.out.println("DB처리시 에러 발생....");
			System.out.println(e.getMessage());
		}
	}

}

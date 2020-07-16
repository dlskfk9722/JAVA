package java12;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DBConnect {

	public static void main(String[] args) throws Exception {
		//JDBC프로그래밍 순서
		//1.connector설정
		//외부자원 연결=>에러처리
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1.connector설정 성공..!!!");
		//2.인증(id/pw)받으면 DB연결
		String url = "jdbc:mysql://localhost:3306/bigdata";
		String user="root";
		String password="1234";
		Connection con=DriverManager.getConnection(url,user,password);
		System.out.println("2.DB인증 및 연결 성공");
        //3.SQL문 결정,SQL문 객체화(File,URL)
		String sql="insert into member values('win','win','win','win')";
		PreparedStatement ps=con.prepareStatement(sql);
		System.out.println("3.SQL문 객체화 성공...");
		//4.SQL문 connector통해서 전달
		ps.executeLargeUpdate();
		System.out.println("4.SQL문 connector통해서 전달....");
		
	}

}

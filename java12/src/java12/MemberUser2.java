package java12;

import java.util.Scanner;

public class MemberUser2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("회원가입정보를 입력하세요");
		System.out.println("-------------------");
		System.out.print("아이디>>");
		String id=sc.next();
		System.out.print("비밀번호>>");
		String pw=sc.next();
		System.out.print("이름>>");
		String name=sc.next();
		System.out.print("전화번호>>");
		String tel=sc.next();
	
		Member member1 = new Member(id,pw,name,tel);
		System.out.println(member1);
		
		DBProceess db=new DBProceess();
		db.insert(member1);
	}

}

package java12;

public class DBProceess {
	public void insert(Member member) {
		System.out.println("전달받은 값을DB에 저장합니다.");
		System.out.println(member.id);
		System.out.println(member.pw);
		System.out.println(member.name);
		System.out.println(member.tel);
	}

}

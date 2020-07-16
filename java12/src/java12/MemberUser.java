package java12;

public class MemberUser {

	public static void main(String[] args) {
		Member member1 = new Member("root","root","park","010");
		
		System.out.println(member1);
		
		DBProceess db=new DBProceess();
		db.insert(member1);
	}

}

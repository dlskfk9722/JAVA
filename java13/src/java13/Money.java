package java13;

public class Money {
	//클래스 밑에 선언된 것들은 자동으로 초기화가 된다.
	String name;
	int age;
	static int money=10000;
	
	public Money(String name, int age) {
		this.name = name;
		this.age = age;
		money=money-1000;
	}
	
	

}

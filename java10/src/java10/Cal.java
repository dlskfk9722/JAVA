package java10;

public class Cal {
	//부품(class)=>원형
	//정적인 특징->변수(멤버변수,전역변수,자동초기화)
	//동적인 특징->메소드(접근제어자,반환값,입력값)
	int today=300;//클래스 바로 밑에 썼으므로 전역변수이다=>아무데서나 쓸수 있다(지역변수안에도 쓸수 있음)
	
	//더하기
	public int add(int x,int y) {//메소드 안에 있으므로 메소드 안에서만 쓸수 있다==>지역변수
		return x+y;
	}
	//빼기
	public int minus(int x,int y) {
		return x-y;
	}
	//곱하기
	public int mul(int price,int count) {
		return price*count;
	}
	
	//나누기
	public int div(int sum,int person) {
		return sum/person;
	}
	
	public void welcom(String name) {
		System.out.println(name+"님 환영합니다.");
	}
	
	public void point(String name,int point) {
		System.out.println(name+"님의 포인트는"+point+"원입니다.");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

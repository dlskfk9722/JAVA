package java09;

public class Tv {//Tv 부품=>클래스
	//정적인 특징-모양, 크기=>변수
	String shape;
	int size;
	
	//동적인 특징-켜다,끄다,바꾸다=>메소드
	public void on() {
		System.out.println("Tv를 켜다");
	}
	public void off() {
		System.out.println("Tv를 끄다");
	}
	public void change() {
		System.out.println("Tv의 채널을 바꾸다");
	}
	
	
	

}

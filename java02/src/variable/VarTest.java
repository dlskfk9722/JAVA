package variable;

/*
 * 프로그래머:이나라
 * 최종 수정 날짜:2019.03.19
 * 수정 원인:변수 확인
 */
public class VarTest {

	public static void main(String[] args) {
		// 자바의 기본(1줄 주석)
		System.out.println("오늘은 두번째 날입니다.");
		System.out.println("---------------");
		System.out.println();//enter
		
		byte time=15;//=대입연산자,할당연산자
    //데이터타입 변수명=값;
		int seconds=5124545;
		
		final double PI=3.14;//상수
		//PI=3; 상수는 값을 변경할 수 없다,상수는 항상 같은 값을 갖는다.
		//상수는 일반적으로 상수명을 대문자로 쓴다.(final)
		
		char lastName='이';
		boolean lunch=true;//참:true,거짓:false
		
		System.out.println("지금 시각은?"+time);
		//+=>연결 연산자
		System.out.println("아침부터 지난 초는 ?"+seconds);
		System.out.println("pi의 값은?"+PI);
		System.out.println("나의 이름 첫글자는?"+lastName);
		System.out.println("점심을 먹었나요?"+lunch);
		
		String name="이나라";//String=>" "
		System.out.println("나의 전체 이름은?"+name);

	}

}

package calculate;

public class CalTest3 {

	public static void main(String[] args) {
		//String id="root";//비교 연산자 사용 불가
		//비교 연산자는 기초형 비교만 할 수 있다.
		
		int id=1000;
		int pw=1111;
		
		if(id==1000 && pw==1111) {
			//조건은 비교연산자의 결과는 맞으면, boolean
			//조건이 맞으면 여기 실행
			System.out.println("로그인을 허락합니다.");
		}
		else  {
			System.out.println("로그인을 거절합니다.");
		}
	}

}

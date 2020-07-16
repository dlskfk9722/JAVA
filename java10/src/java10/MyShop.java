package java10;

public class MyShop {

	public static void main(String[] args) {
		//계산기 필요...
		int milk=2000;
		int coffee=4000;
		int icecream=3000;
		int bread=5000;
		
		
		//1.계산
		Cal cal = new Cal();
		int total=cal.add(milk,coffee);
		
		//2.영수증 발행-전체 지불금액,봄 할인(1000),할인후 지불 금액
		
		System.out.println("전체지불금액"+total+"원");
		System.out.println("할인 후 지불 금액"+(total-1000)+"원");
		System.out.println("이용해주셔서 감사합니다.");
		
		System.out.println("--------------------------------");

		int b=cal.mul(bread,2);
		int ice=cal.mul(icecream,3);
		int sum=b+ice;
		System.out.println("전체지불금액"+sum+"원");
		
		int each=cal.div(sum, 2);
		System.out.println("한 사람당"+each+"원");
		System.out.println("--------------------------------");
		
		cal.welcom("park");
		cal.point("park", 1000);
		
		
		
	}

}

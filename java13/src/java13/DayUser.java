package java13;

public class DayUser {

	public static void main(String[] args) {
		System.out.println(Day.count);
		Day day1 = new Day("학원에서 수업듣기",3,"구로");
		System.out.println(day1);
		System.out.println(Day.count);
		Day day2 = new Day("미드보기",2,"집");
		System.out.println(day2);
		System.out.println(Day.count);
		Day day3 = new Day("영어공부",2,"집");
		System.out.println(day3);
		System.out.println(Day.count);
		Day day4 = new Day("영어공부",2,"집");
		Day day5 = new Day("영어공부",2,"집");
		Day day6 = new Day("영어공부",2,"집");
		Day day7 = new Day("영어공부",2,"집");
		
		
		
		
		System.out.println("---------------------");
		System.out.println(Day.sum);
		System.out.println("---------------------");
		System.out.println("내가 하는 일의 평균 시간은: "+Day.sum/Day.count);
		System.out.println(Day.avgTime());
		
		
		
		
	

	}

}

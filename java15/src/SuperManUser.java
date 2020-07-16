
public class SuperManUser {

	public static void main(String[] args) {
		SuperMan sman = new SuperMan();
		sman.fly=true;//superman
		sman.power="강";//man
		sman.name="클라크";//person

		sman.eat();//person
		sman.run();//man
		sman.flyhigh();//person
		System.out.println(sman);
	}

}

package java13;

public class Worker {
	String name;
	String gender;
	int age;
	static int sum;
	static int count;
	
	public static int avgAge() {
		return sum/count;
	}
	
	public Worker(String name, String gender, int age) {
		sum=sum+age;
		count++;
		this.name = name;
		this.gender = gender;
		this.age = age;
	}

	
	@Override
	public String toString() {
		return "Worker [name=" + name + ", gender=" + gender + ", age=" + age + "]";
	}

	public void work() {
		System.out.println("일하다");
	}
	
	public void friendly() {
		System.out.println("친화력 있다.");
	}

}

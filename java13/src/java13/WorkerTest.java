package java13;

public class WorkerTest {

	public static void main(String[] args) {
		
		Worker worker1 = new Worker("임아무개","남",24);
		System.out.println(worker1);
		Worker worker2 = new Worker("김아무개","여",23);
		System.out.println(worker2);
		Worker worker3 = new Worker("박아무개","남",25);
		System.out.println(worker3);
		System.out.println("전체 직원수는:"+Worker.count);
		System.out.println("첫번째 직원의 이름은:"+worker1.name);
		System.out.println("직원들의 평균 나이는"+worker3.avgAge());

	}

}

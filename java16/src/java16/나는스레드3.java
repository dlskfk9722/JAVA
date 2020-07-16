package java16;

public class 나는스레드3 extends Thread {
	
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("나도 또 스레드>> "+i);
		}
	}

}

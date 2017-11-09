package threadtest;
public class demo extends Thread {

	demo() {
		start();
	}
	public void run() {
		for (int i = 1; i < 5; i ++)
			System.out.println(i);
	}
}

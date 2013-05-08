public class MyThread extends Thread {
	public String name;

	public MyThread(String name) {
		this.name = name;
	}

	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(name + ":" + i);
			yield();
		}
	}

}

class TestMyThread {
	public static void main(String[] args) {
		Thread[] threads = { new MyThread("T1"), new MyThread("T2"),
				new MyThread("T3") };
		for (Thread t : threads)
			t.start();
	}

}

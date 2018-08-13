package io.bh.java.threads;

public class TestVolitile extends Thread {

	private String name = null;
	// volatile disable thread's local cache, making thread r/w variable value from main memory.
	private volatile boolean isDone = false;
	private static int count = 0;
	
	
	public TestVolitile(String name) {
		this.name = name;
	}

	public void run() {
		System.out.println(this.name + " entering run, isDone: " + isDone);
		while (!isDone) {
			System.out.println(this.name + ": " + count++);
/*
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			*/
		}

		System.out.println(this.name + " isDone: " + isDone);

	}
	
	public void stopIt() {
		this.isDone = true;
		
	}

	public static void main(String[] args) throws Exception {
		TestVolitile tv1 = new TestVolitile("TV1");
		TestVolitile tv2 = new TestVolitile("TV2");
		tv1.start();
		tv2.start();
		
		Thread.sleep(5);
		tv1.isDone = true;
		tv2.isDone = true;
		/*
		tv1.stopIt();
		tv2.stopIt();
		*/
		System.out.println("End in main!");
	}

}

//import Com.thread.Mythread2;

/*.Create a class MyThread .Make it a Thread.Override run() to print names of your 10 friends stored in an array .
Create 3 threads and start them.*/
public class Mythread1 extends Thread {
	
	public Mythread1() {
		super();
		
	}

	public Mythread1(String name) {
		super(name);
	
	}
	
	public void run()
	{
		String[] a1={"jinesha","rutu","priya","manii","shital","prachi","shrii","sakshi","payal","neha"};
		for(String friends:a1)
		{
			System.out.println(friends);
		}
	super.run();
	}

}

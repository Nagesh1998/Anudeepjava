
public class Mainfriend {

	public static void main(String[] args) {
		
		Thread th1=new Mythread1(); //thread1
		Thread th2=new Mythread1(); //thread2
		Thread th3=new Mythread1(); //thread3
		
		th1.start();
		th2.start();
		th3.start();
	}

}

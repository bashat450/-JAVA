package javaprogram;

/**
 // 1) 
public class MultiThreading extends Thread {
	public void run() {
		System.out.println("Thread is running...");
	}

	public static void main(String[] args) {
		MultiThreading m1 = new MultiThreading();
		m1.start();

	}
}
**/
/**
// 2) Runnable interface(runnable r)
class MultiThreading implements Runnable{
	public void run() {
		System.out.println("Thread is started with runnable interface");
	}
	public static void main(String[] args) {
		MultiThreading m2 = new MultiThreading();
		//Using Runnable r Thread(Runnable r)
		//Explicitly using thread object because 
		//runnable interface having only one method which
		// is run to start execution of thread
		// We create thread class object
		// we pass object of MultiThread class that already
		// implements runnable
		Thread t1 = new Thread(m2);
		t1.start();
	}
}
**/
/**
// 3) Thread (String name)

class MultiThreading{
	//main method
	public static void main(String[] args) {
		//creating object of thread class
		//using constructor. Thread(String name)
		Thread t1 = new Thread("I am using string constructor of thread class");
		//start
		t1.start();
		//getname of thread(invoking the name of thread
		// with the help of getName()method
		String s1 = t1.getName();
		System.out.println(s1);
	}
}
**/
/**
// 4) Thread(Runnable r,String name)
public class MultiThreading implements Runnable{
	public void run() {
		System.out.println("Now runnable thread is running ...");
	}
	//main method
	public static void main(String[] args) {
		//creating object of MultiThreading 4
		Runnable r1 = new MultiThreading();
		// creating object of thread class 
		// with the help of Thread(Runnable r,String name)
		Thread t1 = new Thread(r1,"My thread");
		// Start thread
		t1.start();
		// invoking name of thread
		String s1 = t1.getName();
		System.out.println(s1);	
	}
}
**/


package javaprogram;

public class DeadLockEx{
	 public static void main(String args[]){
	 
	 final String r1="Ms Dhoni";
	 final String r2="Sachin";
	 //t1 tries  to lock r1 and r2
	 
	 Thread t1= new Thread(){
	 //overriding run method
		 public void run(){
			 	synchronized(r1){
			 		System.out.println("Thread 1 is lock r1");
			 		try
			 		{
			 			Thread.sleep(100);
			 		}
			 		catch(Exception e){}
			 		synchronized(r2){
			 			System.out.println("thread t1 is lock r2");
			 		}
			 	}
		 }
	 };
	//t2 try to lock r1 and r2
	 Thread t2= new Thread(){
	 //overriding run for t2
		 public void run(){
			 synchronized(r2){
				 System.out.println("Thread 2 is lock r2");
				 try {
					 Thread .sleep(100);
				 }
				 catch(Exception e){}
				 synchronized(r1){
					 System.out.println("Thread 2 :lock r1");
				 }
			 }
		 }
	};
			t1.start();
			t2.start();
	}
}

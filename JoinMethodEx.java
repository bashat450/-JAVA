package javaprogram;
//import java.io.*;
class ThreadJoin extends Thread {
//overriding run method
	public void run() {
		
for(int j=0;j<2;j++)
{
try
{
//sleeping 
Thread.sleep(1200);
System.out.println("The current thread working is:"+Thread.currentThread().getName());
}
//catch block for exception raised by try block
catch(Exception e)
{
	System.out.println("THe exception is caught"+e);
}
System.out.println(j);
}
}
}
public class  JoinMethodEx {
//public class JoiningThreadsEX{
public static void main(String args[]){

	ThreadJoin  th1=new  ThreadJoin();
	ThreadJoin  th2=new  ThreadJoin();
	ThreadJoin  th3=new  ThreadJoin();

th1.start();
//start second thread th1
//until first thread has ended or die th2
try{
	System.out.println("The current thread working:"+Thread.currentThread().getName());

//using join
th1.join();
}
//catch
catch(Exception e)
{
	System.out.println("The exception has been caught"+e);
}

//thread th2
th2.start();
//th3 start working after completing th2
try{
	System.out.println("The current thread working:"+Thread.currentThread().getName());

//using join
th2.join();
}
//catch
catch(Exception e)
{
	System.out.println("The exception has been caught"+e);
}
th3.start();
}
}


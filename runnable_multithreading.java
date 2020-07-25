//The interface, The Runnable interface should be implemented by anyclass whose instances are intended to be executed by a thread.
//The class must define a method of no arguments called run. 
class Hi1 implements Runnable
{
	public void run() //If we use threads in a class then we have to use run method to compulsarily execute the program
	{
		for (int i=0;i<5;i++)
		{
			System.out.println("Hi");
			try {Thread.sleep(1000);} catch(Exception e){} //It does not shows any exception but in threads it should be used...
		}
	}
}

class Hello1 implements Runnable
{
	public void run() //Run must be executed because it is defined in the interface so that it should be defined in the class 
	//In which it is implementing.
	{
		for (int i=0;i<5;i++)
		{
			System.out.println("Hello");
			try {Thread.sleep(1000);} catch(Exception e){}
		}
	}
}


public class runnable_multithreading 
{

	public static void main(String[] args)
	{

		Runnable obj1=new Hi1();
		Runnable obj2=new Hello1();
		Thread t1=new Thread(obj1);
		Thread t2=new Thread(obj2);
		t1.start(); //We Have used start method to start executing like a thread ....
		t2.start();
		
	}

}

//join() method is used to stop the main thread executing until the threads we created executes.
//isAlive() method is used to check whether the thread is still processing or executing or nit
//If the thread is executing then it returns true or else false.



public class join_isAlive_multithread 
{

	public static void main(String[] args) throws Exception //The join method may give exception so we have to declare throws Exception
	{
		Thread t1=new Thread(() ->//We have removed the class and the object and we have directly gave them like this 
		{
			for (int i=0;i<5;i++)
			{
				System.out.println("Hi");
				try {Thread.sleep(1000);} catch(Exception e){} //It does not shows any exception but in threads it should be used...
			}
		});
		Thread t2=new Thread(() -> //This is called the Lambda expression which is my favorite
		{
			for (int i=0;i<5;i++)
			{
				System.out.println("Hello");
				try {Thread.sleep(1000);} catch(Exception e){}
			}
		});
		
		
		t1.start(); //We Have used start method to start executing like a thread ....
		try {Thread.sleep(10);} catch(Exception e) {}
		t2.start();
		
		t1.join();
		t2.join();
		
		t1.isAlive();
		
		System.out.println("Bye"); //This is used by the default thread

	}

}

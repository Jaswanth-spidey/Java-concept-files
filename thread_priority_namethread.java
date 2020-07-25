//The name can be set to a thread by using methods getName() and setName()
//In other way we can declare it at last by using comma(It is shown in the code)
//Priority is the thing which the thread the JVM is given to
//The priority by default from 1-10 it is given 5
//We can keep priorities by getters and setters


public class thread_priority_namethread 
{

	public static void main(String[] args)
	{
		Thread t1=new Thread(() ->//We have removed the class and the object and we have directy gave them like this 
		{
			for (int i=0;i<5;i++)
			{
				System.out.println("Hi");
				try {Thread.sleep(1000);} catch(Exception e){} //It does not shows any exception but in threads it should be used...
			}
		},"Hi Thread");
		Thread t2=new Thread(() -> //This is called the Lambda expression which is my favorite
		{
			for (int i=0;i<5;i++)
			{
				System.out.println("Hello");
				try {Thread.sleep(1000);} catch(Exception e){}
			}
		},"Hello Thread");
		
		t1.getPriority();
		t2.getPriority();
		
		t1.getName();
		t2.getName();	
		t1.start(); //We Have used start method to start executing like a thread ....
		t2.start();

	}

}

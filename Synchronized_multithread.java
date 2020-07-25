//Synchronized key word is used in a method in a class so that when two or more threads are using the methods there would be no errors
//When two or more threads try to access the same method there would be some interrupiton of another thread while one thread is working on it
//So synchronized key word stops the multiple threads working on the same method at once and permits only one thread

class Counter
{
	int count;
	public synchronized void increment()
	{
		count++;
	}
}

public class Synchronized_multithread 
{

	public static void main(String[] args) throws Exception 
	{
		Counter c = new Counter();
		
		Thread t1= new Thread(new Runnable()
								{
									public void run() 
									{
										for (int i=0;i<1000;i++)
										{
											c.increment();
										}
									}
								});
		Thread t2= new Thread(new Runnable()
				{
					public void run() 
					{
						for (int i=0;i<1000;i++)
						{
							c.increment();
						}
					}
				});
		
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		
		System.out.println("Count is :"+c.count);
		

	}

}

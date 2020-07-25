//Threads are the pieces of the code that runs based on the type of processor. Example we have
//Single core processor, Dual core processor, ..., Upto Octa core processor
//So it decreases the time of execution and run the code fast

class Hi extends Thread //here the class extends the "Thread" class so that it can use thread properties
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

class Hello extends Thread
{
	public void run()
	{
		for (int i=0;i<5;i++)
		{
			System.out.println("Hello");
			try {Thread.sleep(1000);} catch(Exception e){}
		}
	}
}



public class threrad_extends
{

	public static void main(String[] args)
	{
		Hi obj1=new Hi();
		Hello obj2=new Hello();
		obj1.start(); //We Have used start method to start executing like a thread ....
		obj2.start();

	}

}

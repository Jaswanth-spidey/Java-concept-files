//Lambda expression is a way to write the code efficiently so that to decrease the number of lines and effort for the coder
//The expression is written easily that is first we have take the object if a reference as interface and after new we
//keep "()" and we keep "->" arrow and we provide the actions it has to perform


public class Lambda_expression_multithread
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
		t2.start();
		
		
	}

}

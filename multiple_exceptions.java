//We can handle multiple exceptions in multiple ways


public class multiple_exceptions 
{

	public static void main(String[] args) 
	{
		try 
		{
			int a[]= new int[6];
			a[6]=4;
			int i=8;
			int j=4;
			int k=i/j;
		}
		
		catch (ArithmeticException  | ArrayIndexOutOfBoundsException e ) //1st method either we can handle multiple exceptions by "|" <-this or else follow the next steps
		{
			System.out.println("There is either an exception of index out of bound or the number can't be divisible by zero ");
			
		}
		
		try 
		{
			int d=3;
			int e=0;
			int f=d/e;
		}
		
		catch(ArithmeticException e) //The another method can be like this
		{
			System.out.println("Any number can't be divided by zero");
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("The array index is out of the boundary please re-check it");
		}
		
		catch(NullPointerException e)
		{
			System.out.println("The null pointer cannot be defined sorry..");
		}
		
		catch(Exception e) //Make sure that this catch exception should be at last or else it will show you an error
		{
			System.out.println("i Think there is another exception please recheck it..");
		}
		
		finally
		{
			System.out.println("The program has exited with exit code:1.");
		}

	}

}

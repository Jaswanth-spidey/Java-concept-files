//Exception is different from the error that a programmer can handle where of there is an error the programmer cannot handle it 
//There are two types of exceptions they are checked and unchecked
//There are two type of exception statements they are 
//1. Normal ex: int i=1;
//2. Critical ex: int k=3/0;
//This is unchecked type of exeption


public class exceptionhanding
{

	public static void main(String[] args) 
	{
		try //try key word checks that is it tries the exception if it not an exception it gets executed or else it throws to the catch class
		{
			int i=1;
			int j=0;
			int k=i/j;
			System.out.println("Output is" + k);
		}
		
		catch (Exception e) //catch keyword catches the exception and executes the statement that is present in the catch class
		{
			System.out.println("There is some error");
		}
		
		finally //finally keyword executes after the exception process is completed
		{
			System.out.println("The programe has exited with exit code:1");
		}

	}

}


public class Buffered_exception_user_defined
{

	public static void main(String[] args)
	{
		try
		{
			int i=8;
			int j=9;
			int k=i/j;
			if (k==0)
				throw new TeluskoException("This is not possible"); //New class name TeluskoException has been created by me and
			//I had used in the program by this we know that we got the user defined exceptions
		}
		
		catch(TeluskoException e)
		{
			System.out.println("Error"+e.getMessage()); //getmessage is used to get the string we declared to get this error
		}

	}

}

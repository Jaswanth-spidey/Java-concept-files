//BufferedReader is a Java class that reads text from the input stream.
//It buffers the characters so that it can get the efficient reading of characters, arrays, etc.
//It inherits the reader class and makes the code efficient since we can read the data line-by-line with the readline() method.
import java.io.InputStreamReader;
import java.io.BufferedReader;


public class buffered_reader 
{

	public static void main(String[] args) throws Exception //This throws exception keyword finds out if there is any exception
	{
		int n=0;
		System.out.println("Enter a number ");
		
		BufferedReader id=null;
		try //Or else we can use try-catch method to find out the error
		{
			id= new BufferedReader(new InputStreamReader(System.in));
			n= Integer.parseInt( id.readLine());
		}
		
		catch(Exception e) //It could cover but the errors are called checked errors like IO errors etc.,
		{
			System.out.println(e); //It would print the known that is checked errors.
		}
		
		finally //in this finally keyword we should close the Buffered reader once it is opened because it takes extra memory.
		{
			id.close();
		}
		
		System.out.println(n);

	}

}

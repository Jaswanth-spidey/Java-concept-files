import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Buffer_reader_try_with_resorces {

	public static void main(String[] args) throws Exception
	{
		int n=0;
		System.out.println("Enter a number "); 
		
		try(BufferedReader id= new BufferedReader(new InputStreamReader(System.in))) //In the new version i.e, 1.7 we can directly close the resource by 
		{
			 
			//These syntax of try above is in the new update i.e, 1.7 or above in which the 
			//resources would get automatically closed after the execution of this.
			n= Integer.parseInt(id.readLine());
		}
		
		
		System.out.println(n);
	}


}

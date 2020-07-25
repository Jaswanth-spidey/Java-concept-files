import java.util.Scanner;
public class Scanner_taking_Input
{

	public static void main(String[] args)
	{
		int n=0;
		System.out.println("Enter a number");
		Scanner abc = new Scanner(System.in);		
		n=abc.nextInt();
		System.out.println(n);
		abc.close();
	}

}

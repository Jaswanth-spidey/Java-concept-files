
/*
 * Varargs
 */
class calcu
{
	public int Add(int ... l)
	{
		int sum=0;
		for (int i : l)
		{
			sum=sum+i;
		}
		return sum;
	}
}
public class vargers 
{
	public static void main (String[] args)
	{
		calcu obj= new calcu();
		System.out.println(obj.Add(1,2,3,4));

	}
}

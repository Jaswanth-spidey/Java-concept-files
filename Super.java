class sup
{
	public sup()
	{
		System.out.println("in A");
	}
	
	public sup(int a)
	{
		System.out.println("Int A");
	}
}
class sub extends sup
{
	public sub()
	{
		super(5);
		System.out.println("in B");
	}
	
	public sub(int b)
	{
		System.out.println("int B");
	}
}

public class Super
{

	public static void main(String[] args)
	{
		sub obj=new sub();
	}

}

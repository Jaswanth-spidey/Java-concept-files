/*
 * Java doesn't support multiple inheritance
 * 
 * Method overriding means when the sub class that extends super class both contain same methods
 * then in the output compiler will consider the sub class if we give object define as B i.e, sub class
 * That means it overrides the method in the super class.
 * 
 * By using super keyword we can execute the method in the super class also.
 */

class A
{
	public void show()
	{
		System.out.println("in A");
	}
}

class B extends A
{
	@Override
	public void show()
	{
		super.show();
		System.out.println("in B");
	}
}
public class Methodoverriding
{

	public static void main(String[] args)
	{
		B obj1=new B();
		obj1.show();
	}

}

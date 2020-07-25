/*
 *The total activity run in the runtime polymorphism there are two types of polymorphism they are runtime and compile time.
 *
 * Dynamic meaning changing when the object changes its class then the reference class don't matter
 * The object does its work or else execute the assigned class that is right side of the object which should extend the 
 * reference class or else it shows error and it can change according to the assigned class so that it is called
 * Dynamic method dipatch method 
 */


class Alpha
{
	public void show()
	{
		System.out.println("In A");
	}
}

class bita 	extends Alpha
{
	public void show()
	{
		System.out.println("IN b");
	}
}
class gamma extends Alpha
{
	public void show()
	{
		System.out.println("In C");
	}
}
public class dynamicmethoddispatch 
{
	public static void main(String[] args)
	{
		Alpha obj2=new bita();
		obj2.show();
		
		obj2=new gamma();
		obj2.show();
	}

}

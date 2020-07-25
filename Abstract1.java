//Abstract class is used to extend the devolopment of the class. If someone wants others tp extend the c;ass
//then abstract class is used.

abstract class Human //Abstract class which gets extended in future
{
	abstract public void eat();
	public void walk()
	{
		
	}
}

class Man extends Human //Concrete class which extends the abstract class at present
{
	public void eat() // we have to define or else we will get error
	{
		
	}
}


public class Abstract1
{

	public static void main(String[] args) 
	{
		Human obj=new Man();
	}

}

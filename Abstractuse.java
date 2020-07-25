//Abstract class is used for extending the subclasses for the same method like Number class contains Integer, Double, and Float classes.

class Enumeric
{
	public void show(Number i)
	{
		System.out.println(i);
	}
}


public class Abstractuse 
{

	public static void main(String[] args)
	{
		Enumeric obj=new Enumeric();
		obj.show(5);
		obj.show(5.5);
		obj.show(5.5f);

	}

}

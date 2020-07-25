// Upto constructors
/*
 * Upto Constructors
 */

class Emp
{
	int a=3;
	int b=4;
	
	public Emp()
	{
		int result1=a+b;
		System.out.println(result1);
	}
	public Emp(int k)
	{
		System.out.println("Single integer constructor executed");
	}
	public Emp(int k,int l)
	{
		System.out.println("Double integer constructor executed");
	}
	public Emp(int k, int l,int m)
	{
		System.out.println("Triple integer constructor executed");
	}
	
	public String Add()
	{
		System.out.println("Add method executed");
		return "Add method executed";
	}
	public String Subract()
	{
		System.out.println("Subract method executed");
		return "Subract method executed";
	}
	public String Multiply()
	{
		System.out.println("Multiply method executed");
		return "Multiply method executed";
	}
	public int Calc()
	{
		int result=a+b;
		return result;
	}
}



public class FIrst_class
{
	public static void main(String[] args)
	{
		Emp obj=new Emp();
		Emp obj1=new Emp(1);
		System.out.println(obj1);
		Emp obj2=new Emp(1,2);
		System.out.println(obj2);
		Emp obj3=new Emp(1,2,3);
		System.out.println(obj3);
		obj.a=1;
		obj.b=2;
		int k=obj.Calc();
		System.out.println(k);
		String a=obj.Add();
		System.out.println(a);
		String b=obj.Subract();
		System.out.println(b);
		String c=obj.Multiply();
		System.out.println(c);
		System.out.println();
		
	}
}
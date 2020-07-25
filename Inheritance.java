/**
 * 
 */

/**
 * @author Chinni
 *
 */

// Inheritance demo

class calc
{
	public int add(int i,int j)
	{
		return i+j;
	}
}

class calcadv extends calc
{
	public int subr(int i,int j)
	{
		return i-j;
	}
}

class calcVeryAdv extends calcadv
{
	public int multi(int i,int j)
	{
		return i*j;
	}
}


public class Inheritance
{
	public static void main(String[] args)
	{
		calcVeryAdv obj= new calcVeryAdv();
		int result1=obj.add(4,5);
		int result2=obj.subr(5, 4);
		int result3=obj.multi(5,4);
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);


	}
}


public class wrapper_classes 
{

	public static void main(String[] args) 
	{
		int i=5; // Primitive data type
		Integer ii=new Integer(5); //Wrapper class or boxing
		int j=ii.intValue(); // unwrapping or unboxing
		Integer value=i; //Auto boxing or Auto wrapping
		int k=value; //Auto unboxing or Auto unwrapping
		//primitive data type works faster than wrapper classes.
		
		String str="123";
		int l=Integer.parseInt(str);
		System.out.println(l);
		
	}

}

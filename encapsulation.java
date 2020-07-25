// Encapsulation-> Binding data with methods

class Student
{
	private int rollno;
	private String name;
	public int getRollno() {
		System.out.println("User has accessed the roll no");
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		System.out.println("User has accesed the name");
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	// Getters and setters
	//for automated right click on the source and generate getters and setters // select the variables and firstly keep the variables private
}
public class encapsulation 
{

	public static void main(String[] args)
	{
		Student obj1=new Student();
		obj1.setRollno(15);
		obj1.setName("Navin Reddy");
		System.out.println(obj1.getRollno());
		System.out.println(obj1.getName());
		
	}

}

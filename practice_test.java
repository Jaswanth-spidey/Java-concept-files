/** Enhanced for loop
 * 
 */

/**
 * @author Chinni
 *
 */ // Enhanced for loop
public class practice_test{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		int num[][]= {
				{1,2,3},
				{4,5,6,7},
				{8,10,11,12}
					 };
		for (int k[]:num)
		{
			for (int l : k)
			{
				System.out.print(" "+l);
			}
			System.out.println();
		}
	}

}

// 2D Arrays
/*
 * 2D Arrays print program
 */
public class kummu 
{

	public static void main(String[] args) 
	{
		{
			int num[][]= {
							{1,2,3,4},
							{2,3,4,5},
							{4,5,6,7}
					     };
			
			for (int i=0;i<3;i++)
			{
				for (int j=0;j<4;j++)
				{
					System.out.print(num[i][j]);
				}
				System.out.println();
			}
		}
	}
}
package selenium_Basic_Program;

public class Pattern_Program_4_Pyramid_1 
{
	public static void main(String[] args) 
	{
		int star=1, space=4;
		for(int row=1;row<=5;row++)  //rows
		{
			for(int i=1;i<=space;i++)  //space
			{
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++)  //star
			{
				System.out.print("*");
			}
			System.out.println();
			star=star+2;
			space--;
		}
	}
}
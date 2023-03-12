package bronze.b3;

import java.util.Scanner;

public class B3_2444_TODO
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int total = scan.nextInt();

		for(int i=1; i<=total*2; i++)
		{
			for(int j=1; j<=2*total+1; j++)
			{
				if(i<=total)
				{
					if(j >= (2*total+1)/2 - (i-1) && j <= (2*total+1)/2 + (i-1))
						System.out.print("*");
					else if(j<=(2*total+1)/2 + (i-1))
						System.out.print(" ");
				}
				else
				{

				}
			}
			System.out.println();
		}
	}
}

package bronze.b3;

import java.util.Scanner;

public class B3_2443
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int total = scan.nextInt();

		for(int i=total; i>=1; i--)
		{
			for(int j=1; j<=2*total+1; j++)
			{
				if((2*total+1)/2 - (i-1) <= j && (2*total+1)/2 + (i-1) >= j)
					System.out.print("*");
				else if((2*total+1)/2 + (i-1)>=j)
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}

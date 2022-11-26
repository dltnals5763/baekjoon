package source_221125.b3;

import java.util.Scanner;

public class B3_2441
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int total = scan.nextInt();
		for(int i=1; i<=total; i++)
		{
			for(int j=1; j<=total; j++)
			{
				if(j<i) System.out.printf(" ");
				else System.out.printf("*");
			}
			System.out.println();
		}
	}
}

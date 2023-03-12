package bronze.b2;

import java.util.Scanner;

public class B2_1233
{
	public static void main(String[] args)
	{
		// 3 2 3 -> 5
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int[] sumArr = new int[20*20*40];
		for(int i=1; i<=a; i++)
		{
			for(int j=1; j<=b; j++)
			{
				for(int k=1; k<=c; k++)
				{
					sumArr[i+j+k] ++;
				}
			}
		}

		int max = 1;
		int result = 0;
		for(int i=sumArr.length-1; i>=0; i--)
		{
			if(max<=sumArr[i])
			{
				max = sumArr[i];
				result = i;
			}
		}
		System.out.println(result);
	}
}

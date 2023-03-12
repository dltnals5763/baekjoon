package bronze.b3;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class B3_2547
{
	public static void main(String[] args) throws IOException
	{
		Scanner scan = new Scanner(System.in);
		int total = scan.nextInt();

		for(int i=0; i<total; i++)
		{
			int cnt = scan.nextInt();
			BigInteger sum = BigInteger.ZERO;
			for(int j=0; j<cnt; j++)
			{
				sum = sum.add(scan.nextBigInteger());
			}

			BigInteger mod = sum.mod(BigInteger.valueOf(cnt));
			if(mod.equals(BigInteger.ZERO)) System.out.println("YES");
			else System.out.println("NO");
		}

		scan.close();
	}
}

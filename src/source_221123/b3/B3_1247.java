package source_221123.b3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class B3_1247
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for(int k=0; k<3; k++)
		{
			int num = Integer.parseInt(br.readLine());
			BigInteger sum = new BigInteger("0");
			for(int i=0; i<num; i++)
			{
				sum = sum.add(new BigInteger(br.readLine()));
			}
			if(sum.compareTo(BigInteger.ZERO) == 1) System.out.println("+");
			else if(sum.compareTo(BigInteger.ZERO) == -1) System.out.println("-");
			else System.out.println("0");
		}

		br.close();
	}
}

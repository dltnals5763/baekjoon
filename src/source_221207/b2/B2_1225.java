package source_221207.b2;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B2_1225
{
	public static void main(String[] args)
	{
		// 123 45 -> 54
		Scanner scan = new Scanner(System.in);
		BigInteger a = scan.nextBigInteger();
		BigInteger b = scan.nextBigInteger();
		List<BigInteger> aList = new ArrayList<>();
		List<BigInteger> bList = new ArrayList<>();
		while(!a.equals(BigInteger.ZERO))
		{
			aList.add(a.mod(BigInteger.valueOf(10)));
			a = a.divide(BigInteger.valueOf(10));
		}
		while(!b.equals(BigInteger.ZERO))
		{
			bList.add(b.mod(BigInteger.valueOf(10)));
			b = b.divide(BigInteger.valueOf(10));
		}

		BigInteger sum = BigInteger.ZERO;
		for(int i=0; i<aList.size(); i++)
		{
			for(int j=0; j<bList.size(); j++)
			{
				sum = sum.add(bList.get(j).multiply(aList.get(i)));
			}
		}

		System.out.println(sum);
	}
}

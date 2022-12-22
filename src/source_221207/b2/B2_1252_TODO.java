package source_221207.b2;

import java.math.BigInteger;
import java.util.Objects;
import java.util.Scanner;

public class B2_1252_TODO
{
	public static void main(String[] args)
	{
		// 1001101 10010 -> 1011111
		/*
		- 더한 값의 경우의 수 : 0, 1, 2
		 */
		Scanner scan = new Scanner(System.in);
		BigInteger a = scan.nextBigInteger();
		BigInteger b = scan.nextBigInteger();
		// 둘 중 더 큰수 구하기
		BigInteger max;
		max = a.compareTo(b) < 0 ?  b : a;
		//
		BigInteger L10 = BigInteger.valueOf(10);
		BigInteger result = BigInteger.ZERO;
		int n = 0; // 자릿수 고려
		while (!Objects.equals(max, BigInteger.ZERO))
		{
			BigInteger sum = a.mod(L10).add(b.mod(L10));
			if(sum.equals(BigInteger.ZERO) || sum.equals(BigInteger.ONE))
			{
				result = (result.add(sum)).multiply(L10.pow(n));
			}
			else if(sum.equals(BigInteger.valueOf(2)))
			{
				sum = BigInteger.ZERO;
				result = (result.add(sum)).multiply(L10.pow(n+1));
			}
			else
			{
				sum = BigInteger.ONE;
				result = (result.add(sum)).multiply(L10.pow(n+1));
			}
			 a = a.divide(L10);
			 b = b.divide(L10);
			 max = max.divide(L10);
			 n++;
		}
		System.out.println(result);
	}
}

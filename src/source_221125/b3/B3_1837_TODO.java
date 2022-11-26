package source_221125.b3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class B3_1837_TODO
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer nums = new StringTokenizer(br.readLine());
		BigInteger multiNum = BigInteger.valueOf(Long.parseLong(nums.nextToken())); // bigInteger
		BigInteger minNum = BigInteger.valueOf(Long.parseLong(nums.nextToken()));;
		// 약수를 구하고, 그 약수의 약수들을 구해서 소수인 애들을 찾기
		List<BigInteger> divisors = new ArrayList<>();
		for(BigInteger i=BigInteger.ONE; i.compareTo(multiNum) <= 0; i = i.add(BigInteger.ONE))
		{
			if((multiNum.mod(i)).compareTo(BigInteger.ZERO) ==0)
				divisors.add(i);
		}
		List<BigInteger> decimals = new ArrayList<>();
		for (BigInteger divisor : divisors)
		{
			int cnt = 0;
			for(BigInteger i=BigInteger.ONE; i.compareTo(divisor) <= 0; i = i.add(BigInteger.ONE))
			{
				if((divisor.mod(i)).compareTo(BigInteger.ZERO) ==0)
					cnt++;
			}
			if(cnt == 2)
				decimals.add(divisor);
		}
		BigInteger dem1 = decimals.get(0);
		BigInteger dem2 = decimals.get(1);
		BigInteger min;
		// 최소값 구하기
		if(dem1.compareTo(dem2) < 0)
			min = dem1;
		else
			min = dem2;
		// 출력하기
		if(min.compareTo(minNum) < 0)
			System.out.println("BAD " + min);
		else
			System.out.println("GOOD");
	}
}

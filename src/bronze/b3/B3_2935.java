package bronze.b3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class B3_2935
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BigInteger a = BigInteger.valueOf(Long.parseLong(br.readLine()));
		String operation = br.readLine();
		BigInteger b = BigInteger.valueOf(Long.parseLong(br.readLine()));

		if("*".equals(operation))
			System.out.println(a.multiply(b));
		else
			System.out.println(a.add(b));

		br.close();
	}
}

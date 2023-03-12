package bronze.b2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public class B2_2145
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true)
		{
			int line = Integer.parseInt(br.readLine());
			if(line == 0)
				break;
			while(true)
			{
				int result = calculate(line);
				if(result/10 == 0)
				{
					System.out.println(result);
					break;
				}
				else
					line = result;
			}
		}
	}
	private static int calculate(int num)
	{
		int sum = 0;
		while(num >0)
		{
			sum += num%10;
			num /= 10;
		}
		return sum;
	}
}

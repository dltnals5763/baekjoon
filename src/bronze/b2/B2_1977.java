package bronze.b2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class B2_1977
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int m = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		List<Integer> powNums = new ArrayList<>();
		for(int i=m; i<=n; i++)
		{
			boolean isSqrt = false;
			double sqrt = Math.sqrt(i);
			String num = String.valueOf(sqrt);
			if(".0".equals(num.substring(num.length()-2)))
			{
				isSqrt = true;
			}
			if(isSqrt)
			{
				powNums.add((int) (sqrt * sqrt));
			}
		}
		if(powNums.size() == 0)
		{
			System.out.println("-1");
		}
		else
		{
			// 최소, 합 구하기
			int sum = 0;
			int min = n;
			for(int pow : powNums)
			{
				if(pow <= min)
					min = pow;
				sum += pow;
			}
			System.out.println(sum);
			System.out.println(min);
		}
	}
}

package source_221128.b3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class B3_2501
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int num = Integer.parseInt(st.nextToken());
		List<Integer> divisors = new ArrayList<>();

		for(int i=1; i<=num; i++)
		{
			if(num % i ==0)
				divisors.add(i);
		}

		int k = Integer.parseInt(st.nextToken());
		if(divisors.size() < k)
			System.out.println(0);
		else
			System.out.println(divisors.get(k-1));

		br.close();
	}
}

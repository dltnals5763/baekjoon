package bronze.b3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B3_2460
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] sums = new int[11];
		sums[0] = 0;
		for(int i=1; i<=10; i++)
		{
			StringTokenizer st = new StringTokenizer(br.readLine());
			sums[i] = - Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()) + sums[i-1];
		}

		int max = 0;
		for(int a : sums)
		{
			if(max < a)
				max = a;
		}

		System.out.println(max);
	}
}

package source_221128.b3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B3_2721
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = Integer.parseInt(br.readLine());
		for(int i=0; i<cnt; i++)
		{
			int num = Integer.parseInt(br.readLine());
			int w = 0;
			for(int j=1; j<=num; j++)
			{
				w += j * sum(j);
			}
			System.out.println(w);
		}
		br.close();
	}
	private static int sum(int num)
	{
		int sum = 0;
		for(int i=1; i<=num+1; i++)
			sum += i;
		return sum;
	}
}

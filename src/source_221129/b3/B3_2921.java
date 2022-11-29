package source_221129.b3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B3_2921
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = Integer.parseInt(br.readLine());
		int sum = 0;
		for(int i=0; i<=cnt; i++)
		{
			for(int j=0; j<=i; j++)
			{
				sum += (i+j);
			}
		}
		System.out.println(sum);
	}
}

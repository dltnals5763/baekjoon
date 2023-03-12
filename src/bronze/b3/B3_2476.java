package bronze.b3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class B3_2476
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int cnt = Integer.parseInt(bf.readLine());

		int max = 0;
		for(int i=0; i<cnt; i++)
		{
			StringTokenizer st = new StringTokenizer(bf.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());

			int money = 0;
			if(a == c && b == c)
			{
				money = 10000 + a * 1000;
			}
			else if(a == b || a == c)
			{
				money = 1000 + a * 100;
			}
			else
			{
				money = Math.max(Math.max(a, b), c) * 100;
			}

			if(max < money)
				max = money;
		}
		System.out.print(max+ " ");
	}
}

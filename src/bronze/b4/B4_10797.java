package bronze.b4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B4_10797
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int day = Integer.parseInt(bf.readLine());
		StringTokenizer cars = new StringTokenizer(bf.readLine());
		int cnt = 0;

		while(cars.hasMoreTokens())
		{
			if(day == Integer.parseInt(cars.nextToken()))
				cnt++;
		}

		System.out.println(cnt);
	}
}

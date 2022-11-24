package source_221124.b3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B3_1267
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = Integer.parseInt(br.readLine());
		StringTokenizer times = new StringTokenizer(br.readLine());

		int m = 0;
		int y = 0;

		while(times.hasMoreTokens())
		{
			for(int i=0; i<cnt; i++)
			{
				String time = times.nextToken();
				y += ((Integer.parseInt(time)/30) + 1) * 10;
				m += ((Integer.parseInt(time)/60) + 1) * 15;
			}
		}

		if(m < y) System.out.println("M " + m);
		else if (m > y) System.out.println("Y " + y);
		else System.out.println("Y M " + y);
		br.close();
	}
}

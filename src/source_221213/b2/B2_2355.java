package source_221213.b2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2_2355
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		long a = Long.parseLong(st.nextToken());
		long b = Long.parseLong(st.nextToken());
		if(a>=b)
		{
			System.out.println((a*(a+1))/2 - (b*(b-1))/2);
		}
		else
		{
			System.out.println((b*(b+1))/2 - (a*(a-1))/2);
		}
	}
}

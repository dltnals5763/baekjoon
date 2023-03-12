package bronze.b4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B4_5596
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer userA = new StringTokenizer(br.readLine());
		StringTokenizer userB = new StringTokenizer(br.readLine());
		int sumA = 0;
		int sumB = 0;
		while(userA.hasMoreTokens())
		{
			sumA += Integer.parseInt(userA.nextToken());
		}
		while(userB.hasMoreTokens())
		{
			sumB += Integer.parseInt(userB.nextToken());
		}
		System.out.println(Math.max(sumA, sumB));
	}
}

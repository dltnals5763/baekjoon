package bronze.b2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2_1009
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = Integer.parseInt(br.readLine());
		for(int i=0; i<cnt; i++)
		{
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int square = b % 4 == 0? 4 : b % 4;
			if(Math.pow(a, square) % 10 == 0) System.out.println("10");
			else System.out.println(Math.round(Math.pow(a, square) % 10));
		}
	}
}

package source_221125.b3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B3_2010
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int total = Integer.parseInt(br.readLine());

		int cnt = 0;
		for(int i=0; i<total; i++)
		{
			cnt += i == total-1 ? (Integer.parseInt(br.readLine())) : (Integer.parseInt(br.readLine())-1);
		}

		System.out.println(cnt);
	}
}

package source_221213.b2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2_2292
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long num = Long.parseLong(br.readLine());
		long room = 1;
		long cnt = 1;

		while(true)
		{
			if(num == 1L)
			{
				System.out.println(1);
				break;
			}
			room += 6*cnt;
			cnt ++;
			if(room >= num)
			{
				System.out.println(cnt);
				break;
			}
		}
	}
}

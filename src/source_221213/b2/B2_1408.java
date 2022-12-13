package source_221213.b2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2_1408
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] current = br.readLine().split(":");
		String[] start = br.readLine().split(":");
		int[] result = new int[3];
		boolean isAdd = false;
		for(int i=current.length-1; i>=0; i--)
		{

			int minus = isAdd? Integer.parseInt(start[i]) - Integer.parseInt(current[i]) - 1 : Integer.parseInt(start[i]) - Integer.parseInt(current[i]);
			if(minus < 0 && i!=0)
			{
				result[i] = minus + 60;
				isAdd = true;
			}
			else
				result[i] = minus;
		}

		int cnt = 0;
		for (int i : result)
		{
			System.out.printf("%02d", i);
			cnt ++;
			if(cnt != 3)
				System.out.print(":");
		}
	}
}

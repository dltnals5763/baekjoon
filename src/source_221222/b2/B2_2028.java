package source_221222.b2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2_2028
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = Integer.parseInt(br.readLine());
		for(int i=0; i<cnt; i++)
		{
			String line = br.readLine();
			int digit = line.length();
			int num = Integer.parseInt(line);
			if((num*num)%(Math.pow(10, digit)) == num) System.out.println("YES");
			else System.out.println("NO");
		}
	}
}

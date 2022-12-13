package source_221212.b2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2_1371
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] alpha = new int[('z'-'a')+1];

		String line;
		while((line = br.readLine()) != null)
		{
			for(int i=0; i<line.length(); i++)
			{
				if(line.charAt(i) == ' ')
					continue;
				alpha[(line.charAt(i) - 'a')] ++;
			}
		}
		int max = 0;
		for (int j : alpha)
		{
			if (max <= j)
				max = j;
		}
		for (int i=0; i<alpha.length; i++)
		{
			if(alpha[i] == max)
				System.out.print((char)(i + 'a'));
		}
	}
}

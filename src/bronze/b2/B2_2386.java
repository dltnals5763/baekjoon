package bronze.b2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2_2386
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		while(!"#".equals((line = br.readLine())))
		{
			char c = line.charAt(0);
			String sentence = line.toLowerCase().substring(1);

			int cnt = 0;
			for(int i=0; i<sentence.length(); i++)
			{
				if(sentence.charAt(i) == c)
					cnt++;
			}
			System.out.printf("%c %d%n", c, cnt);
		}
	}
}

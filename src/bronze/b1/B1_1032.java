package bronze.b1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1_1032
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = Integer.parseInt(br.readLine());

		String first = br.readLine();
		char[] phrases = new char[first.length()];
		for(int i=0; i<first.length(); i++)
		{
			phrases[i] = first.charAt(i);
		}

		if(cnt == 1)
			System.out.println(first);
		else
		{
			for(int i=0; i<cnt-1; i++)
			{
				String line = br.readLine();
				for(int j=0; j<phrases.length; j++)
				{
					if(phrases[j] != line.charAt(j))
						phrases[j] = '?';
				}
			}
			for (char phrase : phrases)
			{
				System.out.print(phrase);
			}
		}

		br.close();
	}
}

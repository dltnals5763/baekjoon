package source_221129.b2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2_1100
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int sum = 0;
		for(int i=1; i<=8; i++)
		{
			int iMod = i % 2;
			String line = br.readLine();
			for(int j=1; j<=line.length(); j++)
			{
				char horse = line.charAt(j-1);
				int jMod = j % 2;
				if((iMod == 1 && jMod == 1 && 'F' == horse) || (iMod == 0 && jMod == 0 && 'F' == horse))
					sum ++;
			}
		}
		System.out.println(sum);
	}
}

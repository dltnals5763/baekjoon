package source_221129.b2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2_1152
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int sum = 0;
		int i = 0;
		while(true)
		{
			if(i == line.length())
				break;
			if(line.charAt(i) == ' ')
			{
				if(i != 0 && i != line.length()-1 && line.charAt(i-1) != ' ')
					sum ++;
			}
			i ++;
		}
		if(sum == 0) System.out.println("0");
		else System.out.println(sum+1);

	}
}

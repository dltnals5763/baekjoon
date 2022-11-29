package source_221128.b3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B3_2857
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int i = 1;
		while(i <= 5)
		{
			String name = br.readLine();
			if(name.contains("FBI"))
				sb.append(i).append(" ");
			i ++;
		}

		if(sb.length() == 0)
			System.out.println("HE GOT AWAY!");
		else
			System.out.println(sb);
	}
}

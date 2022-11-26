package source_221125.b3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B3_2490
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for(int i=0; i<3; i++)
		{
			StringTokenizer st = new StringTokenizer(br.readLine());
			int sum = 0;
			for(int j=0; j<4; j++)
			{
				if(1 == Integer.parseInt(st.nextToken()))
					sum++;
			}
			if(sum == 0) System.out.println("D");
			else if(sum == 1) System.out.println("C");
			else if(sum == 2) System.out.println("B");
			else if(sum == 3) System.out.println("A");
			else if(sum == 4) System.out.println("E");
		}
		br.close();
	}
}

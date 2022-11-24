package source_221124.b3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B3_1703
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true)
		{
			String line = br.readLine();
			if("0".equals(line))
				break;

			StringTokenizer st = new StringTokenizer(line);
			int cnt = Integer.parseInt(st.nextToken());
			int sum = 1;
			for(int i=0; i<cnt; i++)
			{
				int branch = Integer.parseInt(st.nextToken());
				int cut = Integer.parseInt(st.nextToken());
				sum = sum * branch - cut;
			}
			System.out.println(sum);
		}
	}
}

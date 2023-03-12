package bronze.b3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B3_2783
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer lowest = new StringTokenizer(br.readLine());
		int lowX = Integer.parseInt(lowest.nextToken());
		int lowY = Integer.parseInt(lowest.nextToken());
		double lowPrice = (lowX) * (1000.0 / lowY);

		int cnt = Integer.parseInt(br.readLine());

		for(int i=0; i<cnt; i++)
		{
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			double total = (x) * (1000.0 / y);
			if(total < lowPrice)
				lowPrice = total;
		}

		System.out.printf("%.2f", lowPrice);
		br.close();
	}
}

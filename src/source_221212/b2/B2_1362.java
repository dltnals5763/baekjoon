package source_221212.b2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2_1362
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = 1;
		while(true)
		{
			// 기준 무게, 현재 무게
			String weightsString = br.readLine();
			StringTokenizer weights = new StringTokenizer(weightsString);
			int standard = Integer.parseInt(weights.nextToken());
			int weight = Integer.parseInt(weights.nextToken());
			if(standard == 0 && weight == 0)
				break;
			// 상태, 시간
			int die = 0;
			while(true)
			{
				String line = br.readLine();
				StringTokenizer st = new StringTokenizer(line);
				String behavior = st.nextToken();
				int minutes = Integer.parseInt(st.nextToken());
				if("#".equals(behavior) && minutes == 0)
				{
					break;
				}
				if("F".equals(behavior))
				{
					weight += minutes;
				}
				else
				{
					weight -= minutes;
				}
				if(weight <= 0)
				{
					die = 1;
				}
			}
			if(die == 1)
			{
				System.out.println(cnt + " RIP");
			}
			else
			{
				if(weight > standard/2.0 && weight < standard * 2)
				{
					System.out.println(cnt + " :-)");
				}
				else
				{
					System.out.println(cnt + " :-(");
				}
			}
			cnt ++;
		}
	}
}

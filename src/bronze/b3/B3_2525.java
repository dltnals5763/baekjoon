package bronze.b3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B3_2525
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer time = new StringTokenizer(br.readLine());
		int hour = Integer.parseInt(time.nextToken());
		int minute = Integer.parseInt(time.nextToken());
		int addMinute = Integer.parseInt(br.readLine());

		int totalMinute = minute + addMinute;
		if(totalMinute > 59)
		{
			int addHour = totalMinute / 60;
			totalMinute = totalMinute - 60 * addHour;

			int totalHour = hour + addHour;
			if(totalHour > 23)
			{
				totalHour = totalHour - 24;
			}
			System.out.println(totalHour+" "+totalMinute);
		}
		else
		{
			System.out.println(hour+" "+(minute+addMinute));
		}

		br.close();
	}
}

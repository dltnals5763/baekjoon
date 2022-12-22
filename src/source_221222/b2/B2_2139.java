package source_221222.b2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.StringTokenizer;

public class B2_2139
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		List<Integer> evenDays = Arrays.asList(1,3,5,7,8,10,12);
		while(!Objects.equals(line = br.readLine(), "0 0 0"))
		{
			int sum = 0;
			StringTokenizer st = new StringTokenizer(line);
			int day = Integer.parseInt(st.nextToken());
			int month = Integer.parseInt(st.nextToken());
			int year = Integer.parseInt(st.nextToken());
			if(month == 1)
			{
				sum = day;
			}
			else if(month == 2)
			{
				sum = day + 31;
			}
			else
			{
				for(int i=1; i<month; i++)
				{
					if(evenDays.contains(i))
						sum += 31;
					else
						sum += 30;
				}
				sum += day;

				// 윤년인지 판단
				if((year % 4 == 0 && year % 10 != 0) || (year % 400 == 0))
				{
					sum = sum - 1;
				}
				else
				{
					sum = sum - 2;
				}
			}
			System.out.println(sum);
		}
	}
}

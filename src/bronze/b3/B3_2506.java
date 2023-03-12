package bronze.b3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class B3_2506
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		List<String> nums = new ArrayList<>();

		while(st.hasMoreTokens())
		{
			nums.add(st.nextToken());
		}

		List<Integer> scores = new ArrayList<>();
		for(int i=0; i<cnt; i++)
		{
			if(i == 0)
				scores.add(Integer.valueOf(nums.get(0)));
			else
			{
				if("0".equals(nums.get(i)))
				{
					scores.add(0);
				}
				else
				{
					if(nums.get(i-1).equals(nums.get(i)))
					{
						scores.add(scores.get(i-1) + 1);
					}
					else
					{
						scores.add(1);
					}
				}
			}
		}

		int total = 0;
		for(int score : scores)
		{
			total += score;
		}

		System.out.println(total);

		br.close();
	}
}

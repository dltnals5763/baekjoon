package bronze.b1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class B1_1145
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		List<Integer> nums = new ArrayList<>();
		for(int i=0; i<5; i++)
		{
			int num = Integer.parseInt(st.nextToken());
			nums.add(num);
		}

		int a = 1;
		while(true)
		{
			int cnt = 0;
			for(int i=0; i<5; i++)
			{
				if(a % nums.get(i) == 0)
					cnt ++;
			}
			if(cnt >= 3)
			{
				System.out.println(a);
				break;
			}
			a ++;
		}
		br.close();
	}
}

package bronze.b2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2_1173
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int num = Integer.parseInt(st.nextToken());
		int min = Integer.parseInt(st.nextToken());
		int max = Integer.parseInt(st.nextToken());
		int plus = Integer.parseInt(st.nextToken());
		int minus = Integer.parseInt(st.nextToken());

		int cnt = 0;
		int time = 0;
		int purse = min;
		boolean isImpossible = false;
		while(true)
		{
			if(max-min < plus)
			{
				isImpossible = true;
				break;
			}
			else
			{
				if(max-purse >= plus)
				{
					purse += plus;
					cnt ++;
				}
				else
				{
					purse -= minus;
					if(purse <= min)
						purse = min;
				}
				time ++;
				if(cnt >= num)
					break;
			}
		}

		br.close();
		int result = 0;
		result = isImpossible? -1 :time;
		System.out.println(result);
	}
}

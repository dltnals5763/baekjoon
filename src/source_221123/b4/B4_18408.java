package source_221123.b4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class B4_18408
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		Map<Integer, Integer> numsMap = new HashMap<>();
		while(st.hasMoreTokens())
		{
			int token = Integer.parseInt(st.nextToken());
			if(numsMap.containsKey(token))
			{
				numsMap.put(token, numsMap.get(token) + 1);
			}
			else
			{
				numsMap.put(token, 0);
			}
		}
		int maxkey = 0;
		int maxVal = 0;
		for(int key : numsMap.keySet())
		{
			if(numsMap.get(key) > maxVal)
			{
				maxVal = numsMap.get(key);
				maxkey = key;
			}
		}
		System.out.println(maxkey);

	}
}

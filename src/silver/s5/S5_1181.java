package silver.s5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class S5_1181
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = Integer.parseInt(br.readLine());
		Map<Integer, List<String>> lengthMap = new TreeMap<>();
		for(int i=0; i<cnt; i++)
		{
			String word = br.readLine();
			int length = word.length();
			if(!lengthMap.containsKey(length))
				lengthMap.put(length, new ArrayList<>());
			lengthMap.get(length).add(word);
		}

		for (Map.Entry<Integer, List<String>> entry : lengthMap.entrySet())
		{
			List<String> values = entry.getValue();
			if(values.size() == 1)
				System.out.println(values.get(0));
			else
			{
				values = values.stream().distinct().collect(Collectors.toList());
				Collections.sort(values);
				for(String value : values)
					System.out.println(value);
			}
		}
		br.close();
	}
}

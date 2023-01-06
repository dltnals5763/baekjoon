package source_230106;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class S5_1251
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String word = br.readLine();
		List<String> results = new ArrayList<>();
		for(int i=1; i<word.length(); i++)
		{
			for(int j=i; j<word.length(); j++)
			{
				StringBuilder result = new StringBuilder();
				StringBuilder sb1 = new StringBuilder(word.substring(0, i)).reverse();
				StringBuilder sb2 = new StringBuilder(word.substring(i, j)).reverse();
				StringBuilder sb3 = new StringBuilder(word.substring(j)).reverse();
				result.append(sb1).append(sb2).append(sb3);
				results.add(result.toString());
			}
		}
		Collections.sort(results);
		System.out.println(results.get(0));
	}
}

package silver.s5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class S5_1316
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = Integer.parseInt(br.readLine());
		int num = 0;
		for(int i=0; i<cnt; i++)
		{
			String word = br.readLine();
			List<Character> chars = new ArrayList<>();
			boolean isContinuity = true;
			for(int j=0; j<word.length(); j++)
			{
				if(j!=0 && chars.contains(word.charAt(j)) && word.charAt(j) != word.charAt(j-1))
				{
					isContinuity = false;
					break;
				}
				chars.add(word.charAt(j));
			}
			if(isContinuity)
			{
				num ++;
			}
		}
		System.out.println(num);
	}
}

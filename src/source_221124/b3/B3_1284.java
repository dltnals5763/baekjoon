package source_221124.b3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class B3_1284
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<Integer> numList = new ArrayList<>();
		while(true)
		{
			String num = br.readLine();
			if(num.equals("0"))
				break;
			else
			{
				int sum = 1;
				for(int i=0; i<num.length(); i++)
				{
					char numChar = num.charAt(i);
					if(numChar == '1')
						sum += 2;
					else if(numChar == '0')
						sum += 4;
					else
						sum += 3;
					sum += 1;
				}
				numList.add(sum);
			}
		}

		for (Integer integer : numList)
		{
			System.out.println(integer);
		}
	}
}

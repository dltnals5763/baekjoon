package bronze.b3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B3_1547
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = Integer.parseInt(br.readLine());
		boolean[] cupArr = {false, true, false, false};
		for(int i=0; i<cnt; i++)
		{
			StringTokenizer cups = new StringTokenizer(br.readLine());
			int cup1 = Integer.parseInt(cups.nextToken());
			int cup2 = Integer.parseInt(cups.nextToken());
			boolean temp;
			temp = cupArr[cup2];
			cupArr[cup2] = cupArr[cup1];
			cupArr[cup1] = temp;
		}
		for(int i=0; i<cupArr.length; i++)
		{
			if(cupArr[i])
			{
				System.out.println(i);
				break;
			}
		}
	}
}

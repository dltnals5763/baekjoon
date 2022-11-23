package source_221123.b4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B4_5554
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sum = 0;
		for(int i=0; i<4; i++)
		{
			sum += Integer.parseInt(br.readLine());
		}
		int minutes = sum / 60;
		System.out.println(minutes);
		System.out.println(sum - minutes * 60);
		br.close();
	}
}

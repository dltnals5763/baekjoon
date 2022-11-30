package source_221130.b2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2_1159
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = Integer.parseInt(br.readLine());
		int[] arr = new int[26];
		for(int i=0; i<cnt; i++)
		{
			arr[br.readLine().charAt(0) - 97]++;
		}

		StringBuilder sb = new StringBuilder();
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] >= 5)
			{
				sb.append((char)(i+97));
			}
		}
		if(sb.length() == 0) System.out.println("PREDAJA");
		else System.out.println(sb);
	}
}

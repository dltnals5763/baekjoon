package source_221123.b4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B4_18411
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int first = Integer.parseInt(st.nextToken());
		int second = Integer.parseInt(st.nextToken());
		int third = Integer.parseInt(st.nextToken());

		System.out.println(Math.max(Math.max(first+second, first+third), second+third));
		br.close();
	}
}

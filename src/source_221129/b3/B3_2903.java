package source_221129.b3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B3_2903
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int spot = Integer.parseInt(br.readLine());
		System.out.println(Math.round(Math.pow(Math.pow(2, spot)+1, 2)));
	}
}

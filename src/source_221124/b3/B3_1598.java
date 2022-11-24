package source_221124.b3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B3_1598
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer nums = new StringTokenizer(br.readLine());
		int num1 = Integer.parseInt(nums.nextToken());
		int num2 = Integer.parseInt(nums.nextToken());

		int num1X = num1%4==0? (num1/4) -1 : num1/4;
		int num2X = num2%4==0? (num2/4) -1 : num2/4;
		int x = Math.abs(num1X-num2X);

		int num1Y = num1%4==0? 4 : num1%4;
		int num2Y = num2%4==0? 4 : num2%4;
		int y = Math.abs(num1Y-num2Y);

		System.out.println(x+y);
	}
}

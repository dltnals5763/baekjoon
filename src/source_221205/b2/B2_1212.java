package source_20221205.b2;

import java.util.Scanner;

public class B2_1212
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		if("0".equals(input)) System.out.println(input);
		else
		{
			StringBuilder output = new StringBuilder();
			for(int i=0; i<input.length(); i++)
			{
				int num = Integer.parseInt(String.valueOf(input.charAt(i))); // 314 -> 11001100
				int remainder = num;
				StringBuilder result = new StringBuilder();
				while(remainder > 0)
				{
					result.append(remainder % 2);
					remainder /= 2;
				}
				// 세자리수에 맞추기
				while(result.length() < 3)
				{
					result.append("0");
				}
				output.append(result.reverse());
			}
			while(output.charAt(0) == '0')
			{
				output = new StringBuilder(output.substring(1));
			}
			System.out.println(output);
		}
	}
}

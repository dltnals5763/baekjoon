package bronze.b2;

import java.util.Scanner;

public class B2_2153
{
	// A : 65 -> 27, a : 97 -> 1
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		String line = scan.nextLine();
		for(int i=0; i<line.length(); i++)
		{
			char c = line.charAt(i);
			sum += c;
			if(c >= 65 && c < 97)
				sum -= 38;
			else
				sum -= 96;
		}
		// 소수인지 판단
		if(sum == 1)
		{
			System.out.println("It is a prime word.");
		}
		else
		{
			int cnt = 0;
			for(int i=1; i<sum; i++)
			{
				if(sum % i == 0)
					cnt ++;
			}
			if(cnt == 1)
				System.out.println("It is a prime word.");
			else
				System.out.println("It is not a prime word.");
		}

		scan.close();
	}
}

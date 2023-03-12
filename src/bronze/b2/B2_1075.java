package bronze.b2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2_1075
{
	public static void main(String[] args) throws IOException
	{
		/*
		1. 끝 두자리를 00으로 바꾸기
		2. 1씩 증가시키면서 나눠서 나누어 떨어지면, 끝에 두자리를 출력하기
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int f = Integer.parseInt(br.readLine());
		int n2 = (n / 100) * 100;

		while (n2 % f != 0)
		{
			n2++;
		}

		System.out.printf("%02d%n", n2 % 100);
		br.close();
	}
}

package bronze.b3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B3_25704
{
	public static void main(String[] args) throws IOException
	{
		/*
		0. result가 더 크면 0을 출력
		1. 도장이 5개 미만일 때
		- 가격 그대로 출력
		2. 5개 이상 10개 미만일 때
		- 500원 할인 출력
		3. 10개 이상 15개 미만일 때
		- 가격의 10프로와 500원을 비교해서 더 큰 걸 구해서 그만큼 할인 출력
		4. 15개 이상 20개 미만일 때
		- 가격의 10프로와 2000원을 비교해서 더 큰 걸 구해서 그만큼 할인 출력
		5. 20개 이상일 때
		- 가격의 25프로와 2000원을 비교해서 더 큰 걸 구해서 그만큼 할인 출력
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = Integer.parseInt(br.readLine());
		int price = Integer.parseInt(br.readLine());

		double result;
		if(cnt < 5)
			result = price;
		else if(cnt < 10)
			result = price - 500;
		else if(cnt < 15)
		{
			if(price * 0.1 < 500)
				result = price - 500;
			else
				result = price * 0.9;
		}
		else if(cnt < 20)
		{
			if(price * 0.1 < 2000)
				result = price - 2000;
			else
				result = price * 0.9;
		}
		else
		{
			if(price * 0.25 < 2000)
				result = price - 2000;
			else
				result = price * 0.75;
		}

		if(result < 0) System.out.println(0);
		else System.out.println(Math.round(result));
	}
}

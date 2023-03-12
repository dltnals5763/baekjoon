package bronze.b3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B3_2875
{
	public static void main(String[] args) throws IOException
	{
		/*
		1. 여자 2로 나눈 몫 구하기.
		2. 남자랑 크기 비교하기
		3. 팀 만들고 남은 나머지랑 인턴 수랑 비교하기
		4. 인턴수가 더 작으면 그만큼의 팀이 만들어지고, 인턴수가 더 크면 나머지와의 차이를 다시 뺴주어야 함
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int woman = Integer.parseInt(st.nextToken());
		int man = Integer.parseInt(st.nextToken());
		int intern = Integer.parseInt(st.nextToken());

		int womanShare = woman / 2;
		int team = Math.min(womanShare, man);
		int remainder = (woman - team * 2) + (man - team);

		if(intern <= remainder)
			System.out.println(team);
		else
		{
			int realRemainder = 0;
			if((intern - remainder) % 3 == 0)
			{
				realRemainder = (intern - remainder) / 3;
			}
			else
			{
				realRemainder = (intern - remainder) / 3 + 1;
			}
			System.out.println(team - realRemainder);
		}
		br.close();
	}
}

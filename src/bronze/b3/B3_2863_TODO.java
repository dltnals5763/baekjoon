package bronze.b3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B3_2863_TODO
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 행렬 만들기
		int[][] bingo = new int[2][2];
		for(int i=0; i<2; i++)
		{
			StringTokenizer st = new StringTokenizer(br.readLine());
			bingo[i][0] = Integer.parseInt(st.nextToken());
			bingo[i][1] = Integer.parseInt(st.nextToken());
		}

		// 행렬 위치 변경 + 계산
		int rotation = 0;
		for(int i=0; i<4; i++) {

		}


		for(int i=0; i<bingo.length; i++)
		{
			for(int j=0; j<bingo.length; j++)
				System.out.print(bingo[i][j]+" ");
			System.out.println();
		}
	}

	private static void swap(int x, int y)
	{
		int tmp;
		tmp = x;
		x = y;
		y = tmp;
	}
}

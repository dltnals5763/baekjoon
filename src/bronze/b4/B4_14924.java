package bronze.b4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B4_14924
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int trainSpeed = Integer.parseInt(st.nextToken());
		int flySpeed = Integer.parseInt(st.nextToken());
		int distance = Integer.parseInt(st.nextToken());

		System.out.println(flySpeed * (distance / (trainSpeed*2)));
	}
}

package source_221123.b4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B4_25828
{
	public static void main(String[] args) throws IOException
	{
		// 25828
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int groups = Integer.parseInt(st.nextToken());
		int people = Integer.parseInt(st.nextToken());
		int positives = Integer.parseInt(st.nextToken());

		int actualPeople = groups * people;
		int kitsPeople = groups + (people * positives);

		if(actualPeople > kitsPeople)
			System.out.println(2);
		else if(actualPeople < kitsPeople)
			System.out.println(1);
		else
			System.out.println(0);
		br.close();
	}
}

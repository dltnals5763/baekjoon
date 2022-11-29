package source_221128.b3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B3_2712
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = Integer.parseInt(br.readLine());
		for(int i=0; i<cnt; i++)
		{
			StringTokenizer st = new StringTokenizer(br.readLine());
			double num = Double.parseDouble(st.nextToken());
			String unit = st.nextToken();

			if("kg".equals(unit)) System.out.printf("%.4f%s%n", 2.2046*num, " lb");
			else if("lb".equals(unit)) System.out.printf("%.4f%s%n", 0.4536*num, " kg");
			else if("l".equals(unit)) System.out.printf("%.4f%s%n", 0.2642*num, " g");
			else if("g".equals(unit)) System.out.printf("%.4f%s%n", 3.7854*num, " l");
		}
	}
}

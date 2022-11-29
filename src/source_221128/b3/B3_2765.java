package source_221128.b3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B3_2765
{
	private static final double PIE = 3.1415927;
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int i=0;
		while(true)
		{
			StringTokenizer st = new StringTokenizer(br.readLine());
			double diameter = Double.parseDouble(st.nextToken()) / (12*5280.0);
			double rotationNum = Double.parseDouble(st.nextToken());
			double second = Double.parseDouble(st.nextToken());
			if(rotationNum == 0)
				break;

			double totalDistance = diameter * rotationNum * PIE;
			System.out.printf("Trip #%d: %.2f %.2f%n", ++i, totalDistance, 3600 * totalDistance/(second));
		}
	}
}

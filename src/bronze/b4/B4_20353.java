package bronze.b4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B4_20353
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double num = Double.parseDouble(br.readLine());
		System.out.printf("%.8f", Math.pow(num, 0.5) * 4.0);
		br.close();
	}
}

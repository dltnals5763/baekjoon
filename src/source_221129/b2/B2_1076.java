package source_221129.b2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.HashMap;

public class B2_1076
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashMap<String, String> colorMap = new HashMap<>();
		colorMap.put("black", "0");
		colorMap.put("brown", "1");
		colorMap.put("red", "2");
		colorMap.put("orange", "3");
		colorMap.put("yellow", "4");
		colorMap.put("green", "5");
		colorMap.put("blue", "6");
		colorMap.put("violet", "7");
		colorMap.put("grey", "8");
		colorMap.put("white", "9");

		String ab = colorMap.get(br.readLine()) + colorMap.get(br.readLine());
		int c = Integer.parseInt(colorMap.get(br.readLine()));
		BigDecimal bg = new BigDecimal(Math.pow(10, c));
		bg = bg.multiply(BigDecimal.valueOf(Long.parseLong(ab)));
		System.out.println(bg);
	}
}

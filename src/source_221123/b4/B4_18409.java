package source_221123.b4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class B4_18409
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(br.readLine());
		String str = br.readLine();
		ArrayList<Character> mo = new ArrayList<>();
		mo.add('a');
		mo.add('i');
		mo.add('u');
		mo.add('e');
		mo.add('o');
		int sum = 0;
		for(int i=0; i<size; i++)
		{
			if(mo.contains(str.charAt(i)))
				sum ++;
		}
		System.out.println(sum);
	}
}

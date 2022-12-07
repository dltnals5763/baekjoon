package source_221207.b2;

import java.util.Scanner;

public class B2_1297
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int diagonal = scan.nextInt();
		int height = scan.nextInt(); // 9 a
		int weight = scan.nextInt(); // 16 (16/9) a

		double a = Math.sqrt(Math.pow(diagonal,2) / (1 + Math.pow(((double)weight/height), 2)));
		System.out.println((int) a + " " + (int)(((double)weight/height) * a));
	}
}

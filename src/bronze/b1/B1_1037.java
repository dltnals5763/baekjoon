package bronze.b1;


import java.util.Scanner;

public class B1_1037 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int num = in.nextInt();

		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		while(num-- > 0) {
			int N = in.nextInt();
			max = Math.max(N, max);
			min = Math.min(N, min);
		}
		System.out.println(max * min);
	}

}

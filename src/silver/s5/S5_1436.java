package silver.s5;

import java.util.Scanner;

public class S5_1436 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int ans = scan.nextInt();

        int i = 665;
        int n = 0;
        do {
            i++;
            if (String.valueOf(i).contains("666")) {
                n++;
            }
        } while (n != ans);
        System.out.println(i);
    }
}

package source_230129.s5;

import java.util.Scanner;

public class S5_1676 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int cnt = 0;
        while (num >= 5)
        {
            cnt += num / 5;
            num /= 5;
        }
        System.out.println(cnt);
    }
}

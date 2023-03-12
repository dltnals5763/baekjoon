package silver.s5;

import java.util.Scanner;

public class S5_1789 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long sum = scan.nextLong();
        int i = 0;
        int cnt = 0;
        while(true) {
            i ++;
            sum = sum - i;
            if(sum > i)
                cnt ++;
            else
                break;
        }
        System.out.println(cnt +1);
    }
}

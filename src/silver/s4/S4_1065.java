package silver.s4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//2023-03-13
public class S4_1065 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int sum = 0;
        if(num >= 99) {
            for(int i=100; i<=num; i++) {
                int a = i/100;
                int b = (i % 100)/10;
                int c = i % 10;
                // 등차가 양일 때, 등차가 음일 때
                if( (b-a==c-b) && (b - a < 0 || (b - a + b <= 9)) ) {
                    sum += 1;
                }

            }
            sum += 99;
        }
        else {
            sum = num;
        }
        System.out.println(sum);

    }
}

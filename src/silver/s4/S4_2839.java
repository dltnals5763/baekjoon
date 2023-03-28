package silver.s4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//2023-03-27
public class S4_2839
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int sum = 0;
        while(true) {
            if(num%5 == 0) {
                sum = num/5;
                break;
            }
            else {
                num -= 3;
                sum ++;
                if(num%5 == 0) {
                    sum += (num/5);
                    break;
                }
                if(num < 5 && num%3 != 0) {
                    sum = -1;
                    break;
                }
            }
        }
        System.out.println(sum);
    }
}

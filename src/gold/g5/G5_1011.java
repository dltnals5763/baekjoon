package gold.g5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//2023-04-05
public class G5_1011
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        for(int i=0; i<cnt; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int num = b-a;

            long sum = 0;
            int k = 0;
            int j = 1;
            while(true) {
                k ++;
                if(k % 2 !=0 && k != 1)
                    j ++;
                sum += j;
                if(sum >= num) {
                    System.out.println(k);
                    break;
                }
            }
        }
    }
}

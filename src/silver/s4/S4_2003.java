package silver.s4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//2023-03-26
public class S4_2003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int cnt = Integer.parseInt(st.nextToken()); // 4
        int sum = Integer.parseInt(st.nextToken()); // 2

        int[] nums = new int[cnt];
        StringTokenizer numsTokens = new StringTokenizer(br.readLine());
        for(int i=0; i<cnt; i++) {
            nums[i] = Integer.parseInt(numsTokens.nextToken());
        }

        int ans = 0;
        for(int i=0; i<cnt; i++) {
            int j=i;
            int total = 0;
            while(true) {
                total += nums[j];
                if(total > sum) {
                    break;
                } else if (total == sum) {
                    ans ++;
                }
                if(j==cnt-1)
                    break;
                j ++;
            }
        }

        System.out.println(ans);
    }
}

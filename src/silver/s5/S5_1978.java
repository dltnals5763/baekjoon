package silver.s5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S5_1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        boolean isReal = true;
        StringTokenizer st = new StringTokenizer(br.readLine());
        int result = 0;
        for(int i = 0; i<cnt; i++) {
            int num = Integer.parseInt(st.nextToken());
            if((num % 2 == 0 && num != 2) || num == 1) {
                isReal = false;
            }
            else {
                isReal = true;
                for(int j=2; j<num; j++) {
                    if (num % j == 0) {
                        isReal = false;
                        break;
                    }
                }
                if(isReal)
                    result ++;
            }

        }
        System.out.println(result);
        br.close();
    }
}

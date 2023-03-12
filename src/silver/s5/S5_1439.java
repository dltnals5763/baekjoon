package silver.s5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S5_1439 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int a = 0; // 0
        int b = 0; // 1
        for(int i=0; i<s.length(); i++)
        {
            char c = s.charAt(i);
            if(i==0)
            {
                if(c == '0')
                    a ++;
                else
                    b ++;
            }
            else
            {
                if(c == '0' && s.charAt(i-1) == '1')
                    a ++;
                else if(c == '1' && s.charAt(i-1) == '0')
                    b ++;
            }
        }
        System.out.println(Math.min(a, b));
        br.close();
    }
}

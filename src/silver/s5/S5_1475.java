package silver.s5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class S5_1475 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int cnt = 0;
        int num = 0;
        List<Character> all = new ArrayList<>();
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == '6' || s.charAt(i) == '9')
            {
                num ++;
            }
            else {
                if(i == 0)
                {
                    all.add(s.charAt(i));
                    cnt ++;
                }
                else if (all.contains(s.charAt(i)))
                {
                    cnt ++;
                }
                else
                {
                    all.add(s.charAt(i));
                }
            }
        }
        if(num == 1)
            System.out.println(cnt);
        else
            System.out.println(cnt + num/2 + num%2);
    }
}

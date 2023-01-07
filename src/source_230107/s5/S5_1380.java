package source_230107.s5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class S5_1380 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = 0;
        while (true) {
            int cnt = Integer.parseInt(br.readLine());
            if(cnt == 0)
                break;
            List<String> names = new ArrayList<>();
            for(int i=0; i<cnt; i++)
            {
                names.add(br.readLine());
            }

            List<Integer> num = new ArrayList<>();
            for(int i=0; i<2*cnt-1; i++)
            {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int line = Integer.parseInt(st.nextToken()) - 1;
                if(num.contains(line))
                    num.remove(line);
                else
                    num.add(line);
            }

            System.out.println(++a + " " + names.get(num.get(0)));
        }
        br.close();
    }
}

package silver.s4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//2023-03-21
public class S4_1620
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        // 데이터 담기
        Map<String, Integer> map = new HashMap<>(); // 문자열:인덱스
        String[] str = new String[n]; // 0~25
        for(int i=1; i<=n; i++) {
            String s = br.readLine();
            map.put(s, i);
            str[i-1] = s;
        }

        for(int i=1; i<=m; i++) {
            String s = br.readLine();
            if(isNum(s)) {
                System.out.println(str[Integer.parseInt(s)-1]);
            } else {
                System.out.println(map.get(s));
            }
        }
    }

    private static boolean isNum(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
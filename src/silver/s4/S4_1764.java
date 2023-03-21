package silver.s4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//2023-03-21
public class S4_1764 {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Set<String> strSet = new HashSet<>();
        for(int i=0; i<n; i++) {
            strSet.add(br.readLine());
        }

        int num=0;
        List<String> strList = new ArrayList<>();
        for(int i=0; i<m; i++) {
            String s = br.readLine();
            if(strSet.contains(s)) {
                num ++;
                strList.add(s);
            }
        }

        System.out.println(num);
        Collections.sort(strList);
        for (String s : strList)
        {
            System.out.println(s);
        }
    }
}

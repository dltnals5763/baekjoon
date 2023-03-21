package silver.s4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//2023-03-21
public class S4_1920
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer nst = new StringTokenizer(br.readLine());
        Set<java.lang.String> nSet = new HashSet<>();
        for(int i=0; i<n; i++) {
            nSet.add(nst.nextToken());
        }

        int m = Integer.parseInt(br.readLine());
        StringTokenizer mst = new StringTokenizer(br.readLine());
        for(int i=0; i<m; i++) {
            String s = mst.nextToken();
            if(nSet.contains(s)) System.out.println(1);
            else System.out.println(0);
        }

    }
}
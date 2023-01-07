package source_230107.s5;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class S5_1343 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String[] boards = s.split("\\.");
        List<String> results = new ArrayList<>();
        boolean isPossible = true;
        for (String board : boards) {
            int length = board.length();
            if(length%2 != 0)
            {
                isPossible = false;
                break;
            }
            else
            {
                StringBuilder sb = new StringBuilder();
                int a = length / 4;
                int b = length % 4;
                for(int i=0; i<a; i++)
                    sb.append("AAAA");
                for(int i=0; i<b; i++)
                    sb.append("B");
                results.add(sb.toString()+".");
            }
        }

        if(!isPossible)
            System.out.println(-1);
        else
        {
            StringBuilder out = new StringBuilder();
            for(String result : results)
            {
                out.append(result).append(".");
            }
            System.out.println(out.substring(0, out.length()-1));
        }
    }
}

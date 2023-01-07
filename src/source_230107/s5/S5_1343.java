package source_230107.s5;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S5_1343 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(calculate(br.readLine()));

    }
    private static String calculate(String s) {
        String ans;
        String a = "AAAA";
        String b = "BB";

        s = s.replaceAll("XXXX", a);
        ans = s.replaceAll("XX", b);
        if(ans.contains("X"))
            ans = "-1";
        return ans;
    }
}

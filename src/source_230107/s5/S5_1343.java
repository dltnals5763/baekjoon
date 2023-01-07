package source_230107.s5;


import java.io.*;

public class S5_1343 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(calculate(br.readLine()));
        bw.flush();
        bw.close();
        br.close();

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

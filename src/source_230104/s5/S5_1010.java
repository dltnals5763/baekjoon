package source_230104.s5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class S5_1010 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        for(int i=0; i<cnt; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            BigInteger n = BigInteger.valueOf(Long.parseLong(st.nextToken()));
            BigInteger m = BigInteger.valueOf(Long.parseLong(st.nextToken()));
            System.out.println(factorial(m).divide(factorial(m.subtract(n)).multiply(factorial(n))));
        }
    }
    public static BigInteger factorial(BigInteger n) {
        if(n.compareTo(BigInteger.valueOf(2)) < 0) // n이 1보다 작거나 같으면
            return BigInteger.ONE;
        else
            return n.multiply(factorial(n.subtract(BigInteger.ONE)));
    }
}

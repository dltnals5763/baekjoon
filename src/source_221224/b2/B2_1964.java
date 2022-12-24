package source_221224.b2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class B2_1964
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        BigInteger s = BigInteger.valueOf(5);
        for(int i=1; i<cnt; i++)
        {
            s = s.add(BigInteger.valueOf((i+2) * 2 + (i)));
        }
        System.out.println(s.remainder(BigInteger.valueOf(45678)));
    }
}
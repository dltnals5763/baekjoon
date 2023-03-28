package silver.s4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//2023-03-27
public class S4_2217
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        List<Integer> nums = new ArrayList<>();
        for(int i=0; i<cnt; i++) {
            nums.add(Integer.parseInt(br.readLine()));
        }
        nums.sort(Collections.reverseOrder());
        int max = 0;
        int i = -1;
        while (true) {
            i ++;
            if(i > cnt-1)
                break;
            int num = nums.get(i) * (i+1);
            if(max < num)
                max = num;
        }
        System.out.println(max);
    }
}


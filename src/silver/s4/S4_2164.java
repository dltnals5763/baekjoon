package silver.s4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//2023-03-27
public class S4_2164
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        Queue<Integer> nums = new LinkedList<>();
        for(int i=1; i<=num; i++) {
            nums.add(i);
        }
        while(nums.size() > 1) {
            nums.poll();
            nums.add(nums.poll());
        }
        System.out.println(nums.poll());
    }
}


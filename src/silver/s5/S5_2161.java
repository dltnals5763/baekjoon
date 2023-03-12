package silver.s5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class S5_2161 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        Queue<Integer> nums = new LinkedList<>();

        for(int i=1; i<=input; i++)
            nums.add(i);

        StringBuilder ans = new StringBuilder();
        while(nums.size() != 1) {

            Integer poll = nums.poll();
            ans.append(poll).append(" ");
            Integer poll1 = nums.poll();
            nums.add(poll1);
        }

        System.out.print(ans);
        System.out.println(nums.peek());

        br.close();

    }
}

package silver.s5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// 2023-03-12
public class S5_2635 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        Map<Integer, List<Integer>> map = new HashMap<>();
        int i=0;
        while(true)
        {
            int b =  a-i;
            if(b==0 || b<a/2)
                break;
            List<Integer> nums = new ArrayList<>();
            nums.add(a);
            nums.add(b);
            // a=100 b=100
            int x = a;
            while(true) {
                b = x-b; // b=0
                if(b<0)
                    break;
                nums.add(b); // 100 100 0 100
                x = nums.get(nums.size()-2); // a=100
            }
            if(!map.containsKey(nums.size())) {
                map.put(nums.size(), nums);
            }
            i++;
        }
        int max = Collections.max(map.keySet());
        System.out.println(max);
        List<Integer> values = map.get(max);
        for(int value : values) {
            System.out.print(value+" ");
        }
    }
}

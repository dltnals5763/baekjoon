package silver.s5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// 2023-03-12
public class S5_2751 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        List<Integer> nums = new ArrayList<>();
        for(int i=0; i<cnt; i++) {
            nums.add(Integer.parseInt(br.readLine()));
        }
        Collections.sort(nums);
        StringBuilder sb = new StringBuilder();
        for(int num : nums)
            sb.append(num).append("\n");
        System.out.println(sb.toString());
    }
}

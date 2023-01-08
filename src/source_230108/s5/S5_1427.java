package source_230108.s5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class S5_1427 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        List<Integer> nums = new ArrayList<>();
        for(int i=0; i<s.length(); i++) {
            nums.add(Integer.parseInt(String.valueOf(s.charAt(i))));
        }
        Collections.sort(nums, Collections.reverseOrder());
        for (Integer num : nums) {
            System.out.print(num);
        }
        br.close();
    }
}

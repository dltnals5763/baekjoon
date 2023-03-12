package silver.s5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

// 2023-03-12
public class S5_2581 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        if(a==1)
            a = a+1;
        int b = Integer.parseInt(br.readLine());
        List<Integer> nums = new ArrayList<>();
        for(int i=a; i<=b; i++) {
            boolean isDecimal = true;
            for(int j=2; j<i; j++) {
                if(i%j == 0) {
                    isDecimal = false;
                    break;
                }
            }
            if(isDecimal) {
                nums.add(i);
            }
        }
        if(nums.size() == 0)
            System.out.println("-1");
        else {
            System.out.println(nums.stream().mapToInt(Integer::intValue).sum());
            System.out.println(nums.get(0));
        }
    }
}

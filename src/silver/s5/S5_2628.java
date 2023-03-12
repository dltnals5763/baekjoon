package silver.s5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

// 2023-03-12
public class S5_2628 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer lines = new StringTokenizer(br.readLine());
        int width = Integer.parseInt(lines.nextToken());
        int length = Integer.parseInt(lines.nextToken());
        List<Integer> widthNums = new ArrayList<>();
        List<Integer> lengthNums = new ArrayList<>();
        widthNums.add(0);
        lengthNums.add(0);
        int cnt = Integer.parseInt(br.readLine());
        for(int i=0; i<cnt; i++) {
            StringTokenizer nums = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(nums.nextToken());
            int b = Integer.parseInt(nums.nextToken());
            if(a == 1)
                widthNums.add(b);
            else
                lengthNums.add(b);
        }
        widthNums.add(width);
        lengthNums.add(length);
        Collections.sort(widthNums);
        Collections.sort(lengthNums);
        int x = 0;
        for(int i=0; i<widthNums.size()-1; i++) {
            int num = widthNums.get(i + 1) - widthNums.get(i);
            if(num > x)
                x = num;
        }
        int y = 0;
        for(int i=0; i<lengthNums.size()-1; i++) {
            int num = lengthNums.get(i + 1) - lengthNums.get(i);
            if(num > y)
                y = num;
        }
        System.out.println(Math.multiplyExact(x,y));
    }
}

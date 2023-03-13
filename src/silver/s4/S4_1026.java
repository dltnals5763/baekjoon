package silver.s4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//2023-03-13
public class S4_1026 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        StringTokenizer a = new StringTokenizer(br.readLine());
        ArrayList<Integer> aList = new ArrayList<>();
        while(a.hasMoreTokens()) {
            aList.add(Integer.parseInt(a.nextToken()));
        }

        aList.sort(Collections.reverseOrder());

        StringTokenizer b = new StringTokenizer(br.readLine());
        ArrayList<Integer> bList = new ArrayList<>();
        while(b.hasMoreTokens()) {
            bList.add(Integer.parseInt(b.nextToken()));
        }

        int sum = 0;
        for(int i=0; i<cnt; i++) {
            int min = Collections.min(bList);
            sum += Math.multiplyExact(aList.get(i), min);
            bList.remove((Integer) min);
        }
        System.out.println(sum);

    }
}

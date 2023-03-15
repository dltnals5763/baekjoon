package silver.s4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// 2023-03-15
public class S4_1158 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num = Integer.parseInt(st.nextToken()); // 7
        int cnt = Integer.parseInt(st.nextToken()); // 3

        Queue<Integer> queue = new LinkedList<>();
        for(int i=1; i<=num; i++) {
            queue.add(i);
        }

        int i=0;
        List<Integer> sums = new ArrayList<>();
        while(!queue.isEmpty()) {
            i++;
            Integer a = queue.poll(); // 반환 후 제거
            if(i%cnt==0) {
                sums.add(a);
            } else {
                queue.offer(a);
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append("<");
        int j =0;
        for(int sum : sums) {
            j++;
            sb.append(sum);
            if(j<sums.size())
                sb.append(", ");
        }
        sb.append(">");

        System.out.println(sb);

    }
}

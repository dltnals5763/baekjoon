package gold.g5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//2023-04-05
public class G5_1240
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int nodeNum = Integer.parseInt(st.nextToken());
        int wantNum = Integer.parseInt(st.nextToken());

        int[][] nodes = new int[nodeNum+1][nodeNum+1];
        int[][] distance = new int[nodeNum+1][nodeNum+1];

        // 관계 설정
        for(int i=0; i<nodeNum-1; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int dist = Integer.parseInt(st.nextToken());
            nodes[a][b] = nodes[b][a] = 1;
            distance[a][b] = distance[b][a] = dist;
        }

        // 거리 계산
        for(int i=0; i<wantNum; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            // bfs
            bfs(start, end, nodeNum, nodes, distance);
        }
    }

    public static void bfs(int start, int end, int nodeNum, int[][] nodes, int[][] distance) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        boolean[] isVisit = new boolean[nodeNum+1];
        int[] ans = new int[nodeNum+1];
        while(!queue.isEmpty()) {
            int cur = queue.poll();
            for(int i=1; i<=nodeNum; i++) {
                if(nodes[cur][i] == 1 && !isVisit[i]) {
                    ans[i] = distance[cur][i] + ans[cur];
                    if(i == end) {
                        System.out.println(ans[i]);
                        return;
                    }
                    queue.add(i);
                    isVisit[i] = true;
                }
            }
        }
    }
}

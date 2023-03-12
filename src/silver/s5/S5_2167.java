package silver.s5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 2023-03-12
public class S5_2167 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] arr = new int[n][m];
        for(int i=0; i<n; i++) {
            StringTokenizer nTokens = new StringTokenizer(br.readLine());
            for(int j=0; j<m; j++) {
                arr[i][j] = Integer.parseInt(nTokens.nextToken());
            }
        }
        int cnt = Integer.parseInt(br.readLine());
        for(int i=0; i<cnt; i++) {
            StringTokenizer line = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(line.nextToken());
            int b = Integer.parseInt(line.nextToken());
            int x = Integer.parseInt(line.nextToken());
            int y = Integer.parseInt(line.nextToken());
            int sum = 0;
            for(int k = a-1; k<=x-1; k++) {
                for(int j=b-1; j<=y-1; j++) {
                    sum += arr[k][j];
                }
            }
            System.out.println(sum);
        }
    }
}

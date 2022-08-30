package baekjoon.bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class B1012 {
    //1012 유기농 배추  -BFS  로 해결 이후 dfs도 풀어보자
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static boolean[][] visit;
    static int[][] cabbage;
    static int m,n,k;
    static int count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        String answer = "";
        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            m = Integer.parseInt(st.nextToken());
            n = Integer.parseInt(st.nextToken());
            k = Integer.parseInt(st.nextToken());
            cabbage = new int[m][n];
            visit = new boolean[m][n];
            count = 0;

            for (int j = 0; j < k; j++) {
                st = new StringTokenizer(br.readLine());
                int p1 = Integer.parseInt(st.nextToken());
                int p2 = Integer.parseInt(st.nextToken());
                cabbage[p1][p2] = 1;
            }
            for (int j = 0; j < m; j++) {
                for (int c = 0; c < n; c++) {
                    if (cabbage[j][c] == 1 && !visit[j][c]) {
                        bfs(j, c);
                        count++;
                    }
                }
            }
            answer += count + "\n";
        }
        System.out.println(answer);

    }
    static void bfs(int x, int y) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x, y});

        while (!queue.isEmpty()) {
            int[] tmp = queue.poll();
            x = tmp[0];
            y = tmp[1];
            visit[x][y] = true;
            for (int i = 0; i < 4; i++) {
                int bx = x + dx[i];
                int by = y + dy[i];
                if (bx >= 0 && bx < m && by >= 0 && by < n) {
                    if (!visit[bx][by] && cabbage[bx][by] == 1) {
                        queue.add(new int[]{bx, by});
                        visit[bx][by] = true;
                    }
                }
            }
        }
    }

}

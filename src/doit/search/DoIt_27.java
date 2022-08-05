package doit.search;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class DoIt_27 {
    //2178   -- 다시 풀어볼것
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    static int n;
    static int m;
    public static int[][] root;
    public static boolean[][] visited;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        visited = new boolean[n][m];
        root = new int[n][m];
        for (int i = 0; i < n; i++) {
            String str = sc.next();
            for (int j = 0; j < m; j++) {
                root[i][j]  = Integer.parseInt(str.substring(j,j+1));
            }
        }
        bfs_27(0, 0);
        System.out.println(root[n - 1][m - 1]);
    }

    public static void bfs_27(int i, int j) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{i, j});
        while (!queue.isEmpty()) {
            int[] now = queue.poll();
            visited[i][j] = true;
            for (int k = 0; k < 4; k++) {
                int x = now[0] + dx[k];
                int y = now[1] + dy[k];
                if (x >= 0 && y >= 0 && x < n && y < m) {
                    if (root[x][y] != 0 && !visited[x][y]) {
                        visited[x][y] = true; // 방문처리 하고
                        root[x][y] = root[now[0]][now[1]] + 1; // 깊이를 업데이트 하고
                        queue.add(new int[]{x, y}); // queue 에 해당 노드 추가
                    }
                }

            }

        }
    }
}

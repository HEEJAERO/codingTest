package inflearn.chapter7;

import java.util.Scanner;

public class Dfs_1 {
    // 경로탐색 - DFS(인접 행렬)

    static int n , m, answer;
    static boolean[][] graph;
    static boolean[] visited;

    public static void dfs_inf1(int v) {
        if (v == n) answer++;
        else{
            for (int i = 1; i <= n; i++) {
                if (graph[v][i] && !visited[i]) {
                    visited[i] = true;
                    dfs_inf1(i);
                    visited[i] = false;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        graph = new boolean[n + 1][n + 1];
        visited = new boolean[n + 1];
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b= sc.nextInt();
            graph[a][b] = true;
        }
        visited[1] = true;
        dfs_inf1(1);
        System.out.println(answer);

    }
}

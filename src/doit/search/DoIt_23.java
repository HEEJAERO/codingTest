package doit.search;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DoIt_23 {// 11724
    static List<Integer>[] near;
    static boolean[] visited;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        near = new ArrayList[n + 1];
        visited = new boolean[n + 1];
        visited[0] = true;
        for (int i = 1; i < n + 1; i++) {  // 초기 배열 초기화
            near[i] = new ArrayList<>();
            visited[i] = false;
        }
        for (int i = 0; i < m; i++) {
            int p = sc.nextInt();
            int q = sc.nextInt();
            near[p].add(q);
            near[q].add(p);
        }
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (!visited[i]) {
                dfs_23(i);
                count++;
            }else{
                continue;
            }
        }
        System.out.println(count);

    }
    public static void dfs_23(int i) {
        if(visited[i]) return;
        visited[i] = true;
        for (int j = 0; j < near[i].size(); j++) {
            dfs_23(near[i].get(j));
        }

    }
}

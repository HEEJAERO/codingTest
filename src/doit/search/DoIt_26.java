package doit.search;

import java.util.*;

public class DoIt_26 {
    public static List<Integer>[] near;
    public static boolean[] visited;
    //1260  - dfs bfs
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int e = sc.nextInt();
        int start = sc.nextInt();
        near = new ArrayList[n + 1];
        visited = new boolean[n + 1];
        visited[0] = true;
        for (int i = 1; i <= n; i++) {
            near[i] = new ArrayList<>();
        }
        for (int i = 0; i < e; i++) { // edge 수만큼 돌면서 넣어줌
            int q = sc.nextInt();
            int p = sc.nextInt();
            near[p].add(q);
            near[q].add(p);
        }
        for (int i = 1; i <= n; i++) {
            Collections.sort(near[i]); // 작은 노드부터 방문하기 위해 정렬
        }
        dfs_26(start);
        Arrays.fill(visited, false);
        visited[0] = true;
        System.out.println("");
        bfs_26(start);

    }

    public static void dfs_26(int seq) { //dfs => 재귀함수 형태로...
        System.out.print(seq+" ");
        visited[seq] = true;
        for (int i :near[seq]) {
            if(!visited[i])
                dfs_26(i);
        }
    }

    public static void bfs_26(int seq) { // queue 를 이용하여 ..
        Queue<Integer> queue = new LinkedList<>();
        queue.add(seq);
        visited[seq] = true;
        // 이후 queue 가 빌떼 까지 탐색
        while (!queue.isEmpty()) {
            Integer node = queue.poll();
            System.out.print(node + " ");
            for (int i : near[node]) {
                if (!visited[i]) {
                    visited[i] = true;
                    queue.add(i);
                }
            }
        }
    }
}

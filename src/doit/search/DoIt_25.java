package doit.search;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DoIt_25 {
    // 13023
    public static boolean[] visited;
    public static List<Integer>[] near;
    public static boolean possible = false;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 노드 갯수
        int m = sc.nextInt(); // 관계 갯수
        near = new ArrayList[n ];
        visited = new boolean[n ];
        for (int i = 0; i < n; i++) {
            near[i] = new ArrayList<>();
            visited[i] = false;
        }
        for (int i = 0; i < m; i++) {
            int p = sc.nextInt();
            int q = sc.nextInt();
            near[p].add(q);
            near[q].add(p);
        }
        for (int i = 0; i < n; i++) {
            dfs_25(i, 1);
            if(possible) break;
        }
        if (possible) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }

    public static void dfs_25(int num, int dept) {
        if(dept==5 || possible ) {
            possible = true;
            return;
        }
        visited[num] = true;

        for (int i = 0; i < near[num].size(); i++) {
            if(!visited[near[num].get(i)])
                dfs_25(near[num].get(i), dept + 1);
        }
        visited[num] = false; // 이후 다시 탐색이 가능하도록 다시 false  로 돌려주자
    }
}

package baekjoon.bfs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B2606 {
    // 2606번 - 바이러스
    // 이어진 노드를 전부 탐색,
    static List<Integer>[] near ;
    static boolean[] visited;
    static List<Integer> answer = new ArrayList<>();
   //static int answer = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(); //노드 수
        int n = sc.nextInt(); // 간선 수
        near  = new ArrayList[m+1];
        visited = new boolean[m + 1];
        for (int i = 0; i <= m; i++) {
            near[i] = new ArrayList<>();
        }
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            near[a].add(b);
            near[b].add(a);
        }
      /* for(int i=1;i<=m;i++){
            for(int j=0;j<near[i].size();j++){
                System.out.print(near[i].get(j)+" ");
            }
            System.out.println();
        }*/
        bfs_2606(1);
        System.out.println(answer.size()-1);
    }
    static void bfs_2606(int now){
        if(visited[now]) return;
        // 방문하지 않은 노드라면 리스트에 더하고 방문여부 true;
        answer.add(now);
        visited[now]=true;
        for(int i=0;i<near[now].size();i++){
            // 이후 인접리스트를 통해 인접노드탐색
            bfs_2606(near[now].get(i));
        }
    }
}

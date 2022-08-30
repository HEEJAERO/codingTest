package baekjoon.bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class B2644 {
    // 촌수계산 -  그래프탐색 문제와 동일
    // class 를 생성해서 해당 클래스를 탐색하는 식으로
    static List<Integer>[] near;
    static int answer;
    static boolean[] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        near = new ArrayList[n+1];
        for (int i = 0; i < n + 1; i++) {
            near[i] = new ArrayList<>();
        }
        visited = new boolean[n + 1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        int p1 = Integer.parseInt(st.nextToken());
        int p2 = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(br.readLine());
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            near[a].add(b);
            near[b].add(a);
        }
        bfs(p1, p2);
        System.out.println(answer);
    }

    static void bfs(int p1, int p2) {
        Queue<Relation> queue = new LinkedList<>();
        queue.add(new Relation(p1, 0));
        while(!queue.isEmpty()){
            Relation r = queue.poll();
            int now = r.now;
            int count = r.count;
            if(now==p2){
                answer = count;
                return;
            }
            for (int i = 0; i < near[now].size(); i++) {
                int tmp = near[now].get(i);
                if(!visited[tmp]){
                    queue.add(new Relation(tmp, count + 1));
                    visited[tmp] = true;
                }
            }
        }
        if(answer == 0) answer = -1;
    }
}
class Relation{
    int now;
    int count;

    public Relation(int now, int count) {
        this.now = now;
        this.count = count;
    }

    @Override
    public String toString() {
        return "Relation{" +
                "now=" + now +
                ", count=" + count +
                '}';
    }
}


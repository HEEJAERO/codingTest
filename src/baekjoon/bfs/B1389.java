package baekjoon.bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class B1389 {
    // 케빈베이컨의 6단계 법칙, 실버 1
    // BFS or 플루이드 워셜

    static List<Integer>[] nearList;
    static int[] dist;
    static int n;
    static int m;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] tmp = br.readLine().split(" ");
        n = Integer.parseInt(tmp[0]);
        m = Integer.parseInt(tmp[1]);
        dist = new int[n + 1];
        nearList = new ArrayList[n + 1];
        for(int i=1;i<=n;i++){
            nearList[i] = new ArrayList<>();
        }
        for(int i=0;i<m;i++){
            tmp = br.readLine().split(" ");
            int a = Integer.parseInt(tmp[0]);
            int b = Integer.parseInt(tmp[1]);
            nearList[a].add(b);
            nearList[b].add(a);
        }
        int minCount = Integer.MAX_VALUE; // 최소 카운트
        int minIdx = 0; // 최소 카운트를 가지고 있는 인덱스
        for(int i=1;i<=n;i++){
            int cnt = bfs(i);
            if(cnt<minCount){
                minCount = cnt;
                minIdx = i;
            }
        }
        System.out.println(minIdx);
    }
    public static int bfs(int start ){ // BFS
        Arrays.fill(dist, -1); // 방문하지 않은 노드는 -1 로 표시
        int cnt = 0;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        dist[start] = 0; // 본인 0
        while (!queue.isEmpty()) {
            int x = queue.poll();
            for (int y : nearList[x]) { // 인접해있는 값들을 순차적으로 방문
                if(dist[y]!=-1) continue;
                dist[y] = dist[x] + 1;
                cnt += dist[y];
                queue.add(y);
            }
        }
        return cnt;
    }

    public static void solve2(){ // 플루이등 워셜 -> 나중에 이 방법으로 다시 풀어보자

    }
}

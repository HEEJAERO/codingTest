package baekjoon.bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class B1326 {
    // 폴짝폴짝 BFS 로...
    static int n;
    static int[] arr;
    static int answer;
    static boolean[] visited;
    static Queue<Integer> queue;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        arr = new int[n];
        visited = new boolean[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        bfs(a-1, b-1);
        System.out.println(answer);
    }

    static void bfs(int a, int b) {
        Queue<Jump> queue = new LinkedList<>();
        queue.add(new Jump(a, 1));
        visited[a] = true;
        while (!queue.isEmpty()) {
            Jump jump = queue.poll();
            int now = jump.now; // 현재 위치
            int num = arr[now]; // 다리에 써있는 숫자
            int count = jump.count;
            for (int i = 0; i < n; i++) {
                if (Math.abs(i - now) % num == 0) {
                    if (i ==  b) {
                        answer = count;
                        return;
                    }
                    if(!visited[i]) {
                        queue.add(new Jump(i, count + 1));
                        visited[i] = true;
                    }
                }
            }
        }
        if(answer==0) answer = -1;
    }
}
class Jump{
    int now;
    int count;

    public Jump(int now, int count) {
        this.now = now;
        this.count = count;
    }
}

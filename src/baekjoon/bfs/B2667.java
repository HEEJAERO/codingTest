package baekjoon.bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class B2667 {
    // 단지번호 붙이기 - 실버1
    // 그래프 탐색 문제 - bfs 로 해결
    static int n;
    static int[][] arr;
    static boolean[][] visited;
    static int count;
    static int group=0;
    static int[] dx = {1,0,-1,0};
    static int[] dy = {0,1,0,-1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new int[n][n];
        visited = new boolean[n][n];
        for(int i=0;i<n;i++){
            String s = br.readLine();
            for(int j=0;j<n;j++){
                arr[i][j] = Character.getNumericValue(s.charAt(j));
            }
        }
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                // 1이고 방문하지 않았다면 탐색시작
                if(arr[i][j]==1 && !visited[i][j]){
                    count = 1;
                    bfs(i, j);
                    group++;
                    list.add(count);
                }
            }
        }
        System.out.println(group);
        list.sort(Comparator.naturalOrder());
        for (int a : list) {
            System.out.println(a);
        }

    }

    public static void bfs(int x, int y) {
        visited[x][y] = true;
        Queue<Node> queue = new LinkedList<>();
        queue.add(new Node(x,y));
        while (!queue.isEmpty()) {
            Node cur = queue.poll();
            // 이제 네 방향으로 탐색 시작
            for(int i=0;i<4;i++) {
                if (dx[i] + cur.x >= 0 && dx[i] + cur.x < n && dy[i] + cur.y >= 0 && dy[i] + cur.y < n) {
                    if(arr[dx[i]+cur.x][dy[i]+cur.y] == 1 && !visited[dx[i]+cur.x][dy[i]+cur.y]){
                        queue.add(new Node(dx[i] + cur.x, dy[i] + cur.y));
                        visited[dx[i]+cur.x][dy[i]+cur.y] = true;
                        //System.out.println(dx[i] + cur.x + " " + (dy[i] + cur.y));
                        count ++;
                    }
                }
            }
        }
    }

    static class Node {
        int x;
        int y;
        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }


}

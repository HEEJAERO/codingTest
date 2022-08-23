package baekjoon.bfs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B2667 {
    // 2667 번 - 단지번호붙이기
    static boolean[][] visited;
    static int[][] arr;
    static int n;
    static int[] dx = {1,-1,0,0};
    static int[] dy = {0,0,1,-1};
    static int count;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        visited = new boolean[n + 1][n + 1];
        arr = new int[n + 1][n + 1];
        List<String> a = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            String tmp = sc.next();
            for (int j = 1; j <= n; j++) {
                arr[i][j] = tmp.charAt(j-1) -48;
            }
        }
        System.out.println("aaa");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                count=0;
                if(!visited[i][j]){
                    bfs_2667(i, j);
                   if(count!=0){
                       System.out.println(count);
                   }
                }else{break;}

            }
        }
    }
    static void bfs_2667(int x,int y){
        if(visited[x][y]) return;//방문했다면 리턴
        // 0 이여도 리턴
        visited[x][y] =true;
        if(arr[x][y]==0) return;
        count++;

    }
}

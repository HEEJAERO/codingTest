package baekjoon.bfs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B1012 {
    //1012 유기농 배추
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        List<int[][]> list = new ArrayList<>();
        for (int i = 0; i < t; i++) {
            int m = sc.nextInt();
            int n = sc.nextInt();
            int x = sc.nextInt();
            list.add(new int[m][n]);
            for (int j = 0; j < x; j++) {
                int[][] arr = list.get(i);
                arr[sc.nextInt()][sc.nextInt()] = 1;
            }
        }
    }

    static void bfs(int x, int y) {

    }
}

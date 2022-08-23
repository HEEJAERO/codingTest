package baekjoon.queue;

import java.util.Scanner;

public class B3190 { //뱀  - 나중에 다시 풀어보자
    static int[] dx = {1, 0, -1};
    static int[] dy = {1, 0, -1};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[][] board = new int[n + 1][n + 1];
        for (int i = 0; i < k; i++) {
            board[sc.nextInt()][sc.nextInt()] = 1;
        }
        int l = sc.nextInt();
        for (int i = 0; i < l; i++) {
            int x = sc.nextInt();
            String c = sc.next();
        }
    }
}

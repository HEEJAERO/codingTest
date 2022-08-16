package baekjoon.dynamic;

import java.util.Scanner;

public class B1149 {
    public static void main(String[] args) {
        // 1149 - rgb 거리
        // 모든 경로에 대한 코스트를 기록하여 그중에서 최소값을 선정
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] cost = new int[n + 1][3];
        for (int i = 1; i <= n; i++) {
            cost[i][0] = sc.nextInt();
            cost[i][1] = sc.nextInt();
            cost[i][2] = sc.nextInt();
        }
        int[][] total = new int[n + 1][3];
        total[1][0] = cost[1][0];
        total[1][1] = cost[1][1];
        total[1][2] = cost[1][2];

        for (int i = 2; i <= n; i++) {
            total[i][0] = Math.min(total[i - 1][1], total[i - 1][2]) + cost[i][0];
            total[i][1] = Math.min(total[i - 1][0], total[i - 1][2]) + cost[i][1];
            total[i][2] = Math.min(total[i - 1][0], total[i - 1][1]) + cost[i][2];
        }

        System.out.print(Math.min(Math.min(total[n][0],total[n][1]),total[n][2]));
    }
}

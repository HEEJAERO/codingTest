package baekjoon.greedy;

import java.util.Scanner;

public class B11047 {
    // 11047 -  동전
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 주어진 동전의 갯수
        int k = sc.nextInt();// 만들어야하는 액수

        int[] cost = new int[n];
        for (int i = 0; i < n; i++) {
            cost[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = n - 1; i >= 0; i--) {
            int tmp = cost[i];
            while (k >= tmp) {
                k-=tmp;
                count++;
            }
        }
        System.out.println(count);

    }
}

package baekjoon.bruteforcing;

import java.util.Arrays;
import java.util.Scanner;

public class B2798 {
    // 블랙잭
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int max = 0;
        for (int i = 0; i < n-2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    int tmp = arr[i] + arr[j] + arr[k];
                    if (tmp > max && tmp <= m) {
                        max = tmp;
                    }
                }
            }
        }
        System.out.println(max);
    }
}

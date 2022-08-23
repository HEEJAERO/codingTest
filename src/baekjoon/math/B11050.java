package baekjoon.math;

import java.util.Scanner;

public class B11050 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int h = 1;
        int m = 1;
        for (int i = n; i > n-k; i--) {
            h *= i;
        }
        for (int i = 1; i <= k; i++) {
            m *= i;
        }
        System.out.println(h / m);
    }
}

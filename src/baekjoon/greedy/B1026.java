package baekjoon.greedy;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class B1026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        int[] B = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            B[i] = sc.nextInt();
        }
        Arrays.sort(A);
        Integer[] b = Arrays.stream(B).boxed().toArray(Integer[]::new);
        Arrays.sort(b, Collections.reverseOrder());
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += A[i] * b[i];
        }
        System.out.println(sum);
    }
}

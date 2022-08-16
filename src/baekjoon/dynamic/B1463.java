package baekjoon.dynamic;

import java.util.Scanner;

public class B1463 {
    // 1463 - 1로 만들기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int[] arr = new int[n + 1];
        arr[1] = 0;
        for (int i = 2; i <= n; i++) {
            arr[i] = arr[i - 1] + 1;
            if (i % 2 == 0) {
                arr[i] = Math.min(arr[i], arr[i / 2] + 1);
            }// 6 으로 나뉘는경우도 있으므로 else 를 붙이면 안됨
            if (i % 3 == 0) {
                arr[i] = Math.min(arr[i], arr[i / 3] + 1);
            }
        }

        System.out.println(arr[n]);

    }
}

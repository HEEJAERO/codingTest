package baekjoon.math;

import java.util.Arrays;
import java.util.Scanner;

public class B2609 {
    // 최대공약수와 최소공배수
    // ->유클리드 호제법  x, y 의 최대공약수는
    // x = qy +r 에서 r ==0 이면 q 가 최대공약수
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[2];
        arr[0] = sc.nextInt();
        arr[1] = sc.nextInt();
        Arrays.sort(arr);
        int r = 10001;
        int x = arr[1];
        int y = arr[0];
        while (true) {
            r = x % y;
            if (r == 0) {
                System.out.println(y);
                System.out.println(arr[0]*arr[1] / y);
                break;
            }
            x = y;
            y = r;
        }

    }
}

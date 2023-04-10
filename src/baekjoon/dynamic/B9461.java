package baekjoon.dynamic;

import java.util.Scanner;

public class B9461 {
    // 파도반 수열
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        long[] answer = new long[t];
        int n;
        long[] arr;
        for (int i = 0; i < t; i++) {
            n = sc.nextInt();
            arr = new long[n + 1];
            for (int j = 1; j <= n; j++) {
                if(j<=3) arr[j] = 1;
                else if(j<=5) arr[j]=2;
                else arr[j] = arr[j - 1] + arr[j - 5];
            }
            answer[i] = arr[n];
        }
        for (int i = 0; i < t; i++) {
            System.out.println(answer[i]);
        }


    }
}

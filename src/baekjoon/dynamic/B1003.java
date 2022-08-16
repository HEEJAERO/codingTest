package baekjoon.dynamic;

import java.util.Scanner;

public class B1003 {
    // 1003 - 피보나치 함수
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }
        int[][] fib = new int[10001][2];

        for(int j=1;j<=n;j++){
            for (int i = 0; i <= arr[j]; i++) {
                if(i==0) {
                    fib[i][0] = 1;
                    fib[i][1] = 0;
                }
                else if(i==1) {
                    fib[i][0] = 0;
                    fib[i][1] = 1;
                }
                else {
                    fib[i][0] = fib[i - 1][0] + fib[i - 2][0];
                    fib[i][1] = fib[i - 1][1] + fib[i - 2][1];
                }
            }
            System.out.println(fib[arr[j]][0]+ " " + fib[arr[j]][1]);
        }
    }
}

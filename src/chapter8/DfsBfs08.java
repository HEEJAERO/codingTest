package chapter8;

import java.util.Scanner;

public class DfsBfs08 {
    // 수열 추측하기 -> 한번 다시 고민해보고 다시 풀어보자 5
    static int[][] arr;
    static int[] b,p, ch;
    static int n;
    static int m;
    static boolean flag = false;
    public static int combination(int n, int r) {
        if(arr[n][r]>0) return arr[n][r];
        if (n == r || r == 0) {
            return arr[n][r] = 1;
        }else{
            return arr[n][r] = combination(n - 1, r - 1) + combination(n - 1, r);
        }
    }
    public static void Solution(int seq, int sum) {
        if(flag) return;
        if (seq == n) {
            //System.out.println(sum);
            if (sum == m) {
                for (int x : p) {
                    System.out.print(x + " ");
                }
                flag = true;
            }
        } else {
            for(int i=1;i<=n;i++){
                if (ch[i] == 0) {
                    ch[i] = 1;
                    p[seq] = i;
                    Solution(seq + 1, sum + p[seq] * b[seq]);
                    ch[i] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[n+1][n+1];
        b = new int[n];
        p = new int[n];
        ch = new int[n+1];
        for(int i =0 ; i<n;i++){
            b[i] = combination(n-1, i);
        }
        Solution(0, 0);
    }
}

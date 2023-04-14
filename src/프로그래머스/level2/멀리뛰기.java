package 프로그래머스.level2;

import java.util.Scanner;

public class 멀리뛰기 {
    public static long solution(int n) {
        // Dynamic Programming
        long[] dp = new long[n+1];
        if(n==1) return 1;
        if(n==2) return 2;
        dp[0] = 0;
        dp[1] = 1L;
        dp[2] = 2L;
        for(int i=3;i<=n;i++){
            dp[i] = (dp[i-1]+dp[i-2]) % 1234567;
        }
        return dp[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(solution(5));
    }
}

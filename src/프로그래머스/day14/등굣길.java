package 프로그래머스.day14;

import java.util.Arrays;

public class 등굣길 {
    static int[][] dp;
    public int solution(int m, int n, int[][] puddles) {
        // puddles 를 지나지 않고 학교에 가는 방법
        // 1. 전체 경우 - puddles 를 지나는 방법( puddles 가 1개 일때만 유효)
        // 경우 - m+n-2 C n-1
        // 2. 경로 탐색 두번째 - dp[i][j] = dp[i-1][j] + dp[i][j-1] 을 이용, 이때 puddles 의 좌표는 0 으로 고정해두고 연산 진행
        dp = new int[n + 1][m + 1];
        for(int[] a:dp)Arrays.fill(a, -1);
        for (int[] puddle : puddles) {
            dp[puddle[1]][puddle[0]] = 0;
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(dp[i][j] == -1){
                    if(i==1 && j == 1) dp[i][j] = 1;
                    else if(i==1){
                        dp[i][j] = dp[i][j - 1];
                    } else if (j == 1) {
                        dp[i][j] = dp[i - 1][j];
                    } else {
                        dp[i][j] = (dp[i][j - 1] + dp[i - 1][j])%1000000007;
                    }
                }
                System.out.print(dp[i][j]+ " ");
            }
            System.out.println();
        }

        return dp[n][m];
    }

    public static void main(String[] args) {
        등굣길 a = new 등굣길();
        System.out.println(a.solution(4, 3, new int[][]{{2,2},{2,3}}));
    }
}

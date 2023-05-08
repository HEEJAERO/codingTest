package 프로그래머스.day1_10.day8;

public class _2XN타일링 {
    public int solution(int n) {
        int answer = 0;
        int[] dp = new int[n+1];
        if(n==1)return 1;
        if(n==2) return 2;
        dp[1] = 1;
        dp[2] = 2;
        for(int i=3;i<=n;i++){
            dp[i] = (dp[i-1]+dp[i-2])%1000000007;
        }

        return dp[n];
    }
    public static void main(String[] args) {

    }
}

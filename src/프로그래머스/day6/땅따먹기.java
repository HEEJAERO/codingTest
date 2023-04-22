package 프로그래머스.day6;

public class 땅따먹기 {
    // Level 2 -> DP -> 점화식을구하는것을 조금 더 연습해야할듯

    static int solution(int[][] land) {
        int answer = 0;
        // int before = -1;
        int n = land.length;
        int[][] dp = new int[n][4];
        for(int i=0;i<4;i++){
            dp[0][i] = land[0][i];
        }

        for(int i=1;i<n;i++){
            for(int j=0;j<4;j++){
                for(int k=0;k<4;k++){
                    if(k==j) continue;
                    dp[i][j] = Math.max(dp[i-1][k]+land[i][j],dp[i][j]);
                }
            }
        }
        for(int i=0;i<4;i++){
            answer  = Math.max(answer,dp[n-1][i]);
        }
        return answer;
    }
    public static void main(String[] args) {
        System.out.println(solution(new int[][]{{1,2,3,5},{5,6,7,8},{4,3,2,1}}));
    }
}

package 프로그래머스.day11;

public class 정수삼각형 {
    // Level 3 , DP
    public int solution(int[][] triangle) {
        int answer = 0;
        int len = triangle.length;
        int[][] dp = new int[len][len];
        dp[0][0] = triangle[0][0];
        for(int i=1;i<len;i++){
            for(int j=0;j<i+1;j++){
                if(j>0){
                    dp[i][j] = Math.max(dp[i-1][j-1], dp[i-1][j]) + triangle[i][j];
                }else{
                    dp[i][j] = dp[i-1][j]+triangle[i][j];
                }
            }
        }

        for(int i=0;i<len;i++){
            answer = Math.max(answer,dp[len-1][i]);
        }
        return answer;
    }
    public static void main(String[] args) {
        정수삼각형 a = new 정수삼각형();
        System.out.println(a.solution(new int[][]{{7}, {3, 8}, {8, 1, 0}, {2, 7, 4, 4}, {4, 5, 2, 6, 5}}));
    }
}

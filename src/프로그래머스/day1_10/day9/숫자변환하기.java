package 프로그래머스.day1_10.day9;

import java.util.Arrays;

public class 숫자변환하기 {
    public int solution(int x, int y, int n) {
        int answer = 0;
        int[] dp = new int[y+1];
        Arrays.fill(dp, 1000001);
        dp[x] = 0;
        for(int i=x+1;i<=y;i++){
            if(i<=n  && i%2 !=0 && i%3 != 0) continue;
            if(i>n) dp[i] = Math.min(dp[i],dp[i-n]+1);
            if(i%2==0) dp[i] = Math.min(dp[i], dp[i / 2] + 1);
            if(i%3==0) dp[i] = Math.min(dp[i], dp[i / 3] + 1);

        }
        if(dp[y] == 1000001) return -1;
        return dp[y];
    }

    public static void main(String[] args) {
        숫자변환하기 a = new 숫자변환하기();
        System.out.println(a.solution(10, 40, 5));
    }
}

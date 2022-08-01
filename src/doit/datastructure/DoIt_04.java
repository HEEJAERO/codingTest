package doit.datastructure;

import java.util.Arrays;
import java.util.Scanner;
// 구간 합 구하기2 - 실버1 - 11660번
public class DoIt_04 {
    static int n;
    static int m;
    public static int Solution() {
        int answer = 0;

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        int[][] arr = new int[n+1][n+1];
        int[][] sum = new int[n+1][n+1];
        int[] answers = new int[m];
        Arrays.fill(answers, 0);
        for(int i = 0;i<=n;i++){
            for(int j=0;j<=n;j++){
                if(j==0 || i==0) {
                    arr[i][j] = 0;
                    sum[i][j] = 0;
                }else{
                    arr[i][j] = sc.nextInt();
                    sum[i][j] = sum[i][j - 1] + sum[i - 1][j] - sum[i - 1][j - 1] + arr[i][j];
                }
            }
        }
        for(int i=0;i<m;i++){
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            answers[i] = sum[x2][y2] - sum[x2][y1-1] - sum[x1-1][y2] + sum[x1 - 1][y1 - 1];
        }
        for (int answer : answers) {
            System.out.println(answer);
        }
    }
}

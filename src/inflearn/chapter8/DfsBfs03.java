package inflearn.chapter8;

import java.util.Scanner;

public class DfsBfs03 {
    //dfs 문제를 풀때는 재귀함수와 전역변수를 적절히 활용하여 해결하도록 하자
    static int n;
    static int max_time;
    static int answer=0;

    public static void Solution(int seq,int sum, int sum_time, int[][] arr) {
        if(sum_time >max_time ) return;
        if(seq==n ){
            answer = Math.max(answer, sum);
        }else{
            Solution(seq + 1, sum + arr[seq][0], sum_time + arr[seq][1], arr);//더하는경우
            Solution(seq + 1, sum, sum_time, arr); //더하지 않는 경우
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        max_time = sc.nextInt();
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = sc.nextInt();//점수
            arr[i][1] = sc.nextInt();//시간
        }
        Solution(0, 0, 0, arr);
        System.out.println(answer);

    }
}

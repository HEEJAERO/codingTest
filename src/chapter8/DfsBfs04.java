package chapter8;

import java.util.Scanner;

public class DfsBfs04 {
    // 중복순열 구하기
    static int n;
    static int m;
    static int[] answer;
    public static void Solution(int seq) {
        if(seq==m) {
            for (int i : answer) {
                System.out.print(i + " ");
            }
            System.out.println();
            return;
        }
        else{
             for(int i=1;i<=n;i++){
                 answer[seq] = i;
                 Solution(seq + 1);
             }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        answer = new int[m];
        Solution(0);
    }
}

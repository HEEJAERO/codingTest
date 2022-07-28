package inflearn.chapter8;

import java.util.Scanner;

public class DfsBfs06 {
    // 순열 구하기
    static int n;
    static int m;
    static int[] pm;
    static int[][] arr;

    public static void Solution(int seq) {
       if (seq == m) {
           for (int p : pm) {
               System.out.print(p + " ");
           }
           System.out.println();
       }else{
           for (int i=0;i<n;i++){
               if(arr[i][1] == 1) continue;

               pm[seq] = arr[i][0];
               arr[i][1] = 1;
               Solution(seq+1);
               arr[i][1] = 0;
           }
       }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m  = sc.nextInt();
        arr= new int[n][2];
        pm = new int[m];
        for(int i=0;i<n;i++){
            arr[i][0] = sc.nextInt();
            arr[i][1] = 0;//0면 사용 x , 1이면 이미 사용중
        }
        Solution(0);
    }
}

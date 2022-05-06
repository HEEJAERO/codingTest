package chapter8;

import java.util.Scanner;

public class DfsBfs09 {
    // 조합 55
    static int n;
    static int m;
    static int[] pm;
    public static void Solution(int seq, int num) {
        if(seq == m){
            for (int x : pm) {
                System.out.print(x + " ");
            }
            System.out.println();

        }else{
            for(int i=num;i<=n;i++){
                pm[seq] = i;
                Solution(seq + 1, i+1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        pm = new int[m];
        Solution(0, 1);

    }
}

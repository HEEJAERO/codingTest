package baekjoon.math;

import java.util.Scanner;

public class B2775 {
    static int[][] arr = new int[15][15];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] answer = new int[t];
        for (int i = 0; i < t; i++) {
            int k = sc.nextInt();
            int n = sc.nextInt();
            answer[i] = getPeopleNum(k, n-1);
        }
        for (int i : answer) {
            System.out.println(i);
        }
    }

    static int getPeopleNum(int k, int n) {
        if(k==0) {
            arr[k][n] = n + 1;
        }
        else if(n==0){
            arr[k][n]=1;
        }else{
            arr[k][n] = getPeopleNum(k - 1, n) + getPeopleNum(k, n - 1);
        }
        return arr[k][n];
    }
}

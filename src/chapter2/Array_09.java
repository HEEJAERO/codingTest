package chapter2;

import java.util.Scanner;

public class Array_09 {
    public static int Solution(int[][] arr) {
        int answer = 0;
        int sum_1 = 0;
        int sum_2 = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum_rows = 0;
            int sum_columns = 0;
            for(int j=0;j<arr.length;j++){
                sum_rows += arr[i][j];
                sum_columns += arr[j][i];
            }
            if(sum_rows>answer) answer = sum_rows;
            if(sum_columns>answer) answer = sum_columns;
            sum_1 += arr[i][i];
            sum_2 += arr[i][arr.length - i - 1];
        }
        if(sum_1>answer) answer = sum_1;
        if(sum_2>answer) answer = sum_2;
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(Solution(arr));
    }
}

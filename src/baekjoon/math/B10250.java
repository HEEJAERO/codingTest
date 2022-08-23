package baekjoon.math;

import java.util.Scanner;

public class B10250 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][3];
        for(int i=0;i<n;i++){
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
            arr[i][2] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            int first = arr[i][2] / arr[i][0];
            int second = arr[i][2] % arr[i][0];
            if(second == 0) {
                second = arr[i][0];
            }else{
                first++;
            }
            if(first <10){
                System.out.println(second+ "0" +first);
            }else{
                System.out.println(second + "" + first);
            }
        }
    }
}

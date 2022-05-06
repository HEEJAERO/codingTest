package chapter10;

import java.util.Scanner;

public class Dynamic06 {
    static int n;
    static int m;
    static int[] dy;

    public static int Solution(int[][] arr) {
        // 갯수가 정해져있으면 뒤에서 부터 탐색하도록 해야한다.
        for (int i = 0;i<n;i++) {
           for(int j= m;j>= arr[i][1];j--){
               dy[j] = Math.max(dy[j], dy[j - arr[i][1]] + arr[i][0]);
           }
        }
        return dy[m];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt(); // 제한시간

        int[][] arr = new int[n][2];
        for(int i=0;i<n;i++){
            arr[i][0] = sc.nextInt(); // 점수
            arr[i][1] = sc.nextInt(); // 시간
        }
        dy = new int[m + 1];
        System.out.println(Solution(arr));
    }
}

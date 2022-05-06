package chapter8;

import java.util.Scanner;

public class DfsBfs07 {// 메모리제이션 : 배열의 값에 메서드 호출값을 넣는 형식으로 구현하여 사용
    static int n;
    static int m;
    static int[][] arr;
    public static int Solution(int a,int b) {
        if(a==0 || b==0 || a==b){
            return arr[a][b] = 1;
        }
        else{
            return arr[a][b] = Solution(a - 1, b - 1) + Solution(a - 1, b);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[n+1][m+1];
        Solution(n,m);
        System.out.println(arr[n][m]);
    }
}

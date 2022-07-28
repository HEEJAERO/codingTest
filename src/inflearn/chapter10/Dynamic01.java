package inflearn.chapter10;

import java.util.Scanner;

public class Dynamic01 {
    // 1. 재귀호출을 이용한 해결
    /*public static int Solution(int n){
        int answer = 0;
        if(n==1) {
            return 1;
        }else if(n==2){
            return 2;
        }
        else{
            return Solution(n - 1) + Solution(n - 2);
        }
    }*/
    // 2. 동적계획법(배열)을 이용한 해결방법

    public static int Solution(int n){
        int[] dy = new int[n+1];
        dy[1]=1;
        dy[2]=2;
        for(int i=3;i<=n;i++){
            dy[i] = dy[i - 1] + dy[i - 2];
        }
        return dy[n];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Solution(n));
    }
}

package inflearn.chapter7;

import java.util.Scanner;

public class Recursive01 {
    //재귀함수-스택 프레임
    public static void Solution(int n){
        if(n==0) return;
        System.out.print(n + " ");
        Solution(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Solution(n);
    }
}

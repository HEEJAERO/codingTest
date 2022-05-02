package chapter7;

import java.util.Scanner;

public class Recursive03 {
    //팩토리얼
    public static int Solution(int n){
        if(n==1) return 1;
        return  n*Solution(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 5;

        System.out.println(Solution(x));
    }
}

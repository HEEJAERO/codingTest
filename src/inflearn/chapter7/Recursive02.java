package inflearn.chapter7;

import java.util.Scanner;

public class Recursive02 {
    //2 진수로 변환하기
    public static void Solution(int x){
        if(x<2){
            System.out.print(x);
            return;
        }
        int num = x%2;
        int next = x/2;
        System.out.print(num);
        Solution(next);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 11;
        Solution(x);
    }
}

package 프로그래머스.day1;

import java.util.Scanner;

public class 점프와순간이동 {
    public static int Solution(int n) {
        int count = 0;

        while(n!=0){
            while(n%2==0){
                n /= 2;
            }
            n--;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(Solution(10));
    }
}

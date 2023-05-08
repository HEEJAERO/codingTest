package 프로그래머스.day1_10.day1;

import java.util.Scanner;

public class 예상대진표 {
    public static int Solution(int n,int a, int b) {
        int answer = 1;
        while (Math.abs(a-b) != 1 || Math.max(a, b) % 2 != 0) {
            a = (a%2 == 0) ? a/2 : (a+1)/2;
            b = (b%2 == 0) ? b/2 : (b+1)/2;
            answer++;
        }

        // while(Math.abs(a-b) != 1 || Math.max(a,b)%2 !=0){
        //     answer ++;
        //     a = a/2;
        //     b = b/2;
        //     System.out.println(a);
        // }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(Solution(8,4,7));
    }
}

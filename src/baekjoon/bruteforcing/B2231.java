package baekjoon.bruteforcing;

import java.util.Scanner;

public class B2231 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            int tmp = i;
            int target = 0;
            while (tmp!=0) {
                target += (tmp % 10);
                tmp = tmp / 10;
            }
            target +=i;
            if (target == n) {
                answer = i;
                break;
            }
        }
        System.out.println(answer);

    }
}

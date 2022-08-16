package baekjoon.dynamic;

import java.util.Scanner;

public class B2839 {
    // 2839 - 설탕 배달
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int count = 0;
        while (n > 0) {
            if (n % 5 == 0) {
                count++;
                n -= 5;
            } else if (n % 3 == 0) {
                count++;
                n -= 3;
            } else if (n > 5) {
                n -= 5;
                count++;
            }else{
                count = -1;
                break;
            }
        }
        System.out.println(count);
    }
}

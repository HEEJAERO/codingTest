package baekjoon.bruteforcing;

import java.util.Scanner;

public class B1436 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int count = 0;
        int target = 665;
        while (true) {
            target++;
            boolean contain = String.valueOf(target).contains("666");
            if (contain) {
                count++;
            }
            if (n == count) {
                break;
            }
        }
        System.out.println(target);
    }
}

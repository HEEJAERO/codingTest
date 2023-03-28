package baekjoon.math;

import java.util.Scanner;

public class B1676 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int[] arr = new int[2];
        for (int i = 1; i <= n; i++) {
            int tmp = i;
            while (tmp % 2 == 0) {
                tmp = tmp / 2;
                arr[0]++;
            }
            while (tmp % 5 == 0) {
                tmp = tmp / 5;
                arr[1]++;
            }
        }
        if (arr[0] < arr[1]) {
            System.out.println(arr[0]);
        }else{
            System.out.println(arr[1]);
        }

    }

}

package baekjoon.hashing;

import java.util.Scanner;

public class B15829 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        String str = sc.next();
        long[] arr = new long[n];
        long sum = 0;
        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i) - 96;
            long tmp= 1;
            for (int j = 1; j <= i; j++) {
                tmp *=31;
                tmp%=1234567891;
            }
            sum += arr[i] *tmp%1234567891;
        }

        System.out.println(sum%1234567891);
    }
}

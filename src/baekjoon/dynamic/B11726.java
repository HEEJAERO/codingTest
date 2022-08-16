package baekjoon.dynamic;

import java.util.Scanner;

public class B11726 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] count = new long[n + 1];
        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                count[i] = 1;
            } else if (i == 2) {
                count[i] = 2;
            }else{
                count[i] = (count[i - 1] + count[i - 2])%10007;
            }
        }
        System.out.println(count[n]);

    }
}

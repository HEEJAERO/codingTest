package baekjoon.dynamic;

import java.util.Scanner;

public class B9095 {
    public static void main(String[] args) {
        // 1,2,3 더하기 9095
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            arr[i] =  sc.nextInt();
        }
        for (int i = 1; i <= n; i++) {
            int[] count = new int[arr[i]+1];
            for (int j = 1; j <= arr[i]; j++) {
                if (j == 1) {
                    count[j] = 1;
                }
                else if (j == 2) {
                    count[j] = 2;
                }
                else if (j == 3) {
                    count[j] = 4;
                }else{
                    count[j] = count[j - 1] + count[j - 2] + count[j - 3] ;
                }
            }
            System.out.println(count[arr[i]]);
        }
    }
}

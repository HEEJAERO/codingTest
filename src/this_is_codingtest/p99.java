package this_is_codingtest;

import java.util.Scanner;

public class p99 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int result = 0;
        while (n != 1) {
            if (n % k == 0) {
                n/=k;
                result++;
            }
            else{
                n -= 1;
                result++;
            }
        }
        System.out.println(result);
    }
}

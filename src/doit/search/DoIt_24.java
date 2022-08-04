package doit.search;

import java.util.Scanner;

public class DoIt_24 {
    // 백준 2023 번
    static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        dfs_24(2, 1);
        dfs_24(3, 1);
        dfs_24(5, 1);
        dfs_24(7, 1);

    }

    public static void dfs_24(int num, int length) {
        if (length == n) {
            if (isPrime(num)) {
                System.out.println(num);
            }
        }
        if (num % 2 == 0 && length!=1) {
            return;
        }
        else if (isPrime(num)) {
            for (int i = 1; i <= 9; i++) {
                dfs_24(num * 10 + i, length + 1);
            }
        }else return;
    }
    public static boolean isPrime(int num){
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

}

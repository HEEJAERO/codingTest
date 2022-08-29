package baekjoon.searching;

import java.util.Arrays;
import java.util.Scanner;

public class B2805 {
    // 나무 자르기 - 이분탐색 -Upper Bound
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        int max = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if(max<arr[i]) max = arr[i];
        }
        max++;
        int min = 0;
        int mid = 0;
        while (min < max) {
            long sum=0;
            mid = (max + min) / 2;
            for (int i = 0; i < n; i++) {
                if(arr[i]-mid <0) continue;
                sum += (arr[i] - mid);
            }
            if (sum < m) {
                max = mid;
            }else{
                min = mid + 1;
            }
        }
        System.out.println(min-1);
    }
}

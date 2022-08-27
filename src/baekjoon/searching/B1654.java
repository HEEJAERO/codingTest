package baekjoon.searching;

import java.util.Arrays;
import java.util.Scanner;

public class B1654 {
    // 랜선자르기  - binary search 에 대해 공부
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[k];
        long max = 0;
        for (int i = 0; i < k; i++) {
            arr[i] = sc.nextInt();
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        max++; // 0 으로 나누는것을 방지하기 위해 +1
        /**
         * upper bound 형식
         * mid 길이로 잘랐을때의 갯수가 만들고가 하는 랜선의 갯수보다 작다면
         * 자르고자 하는 길이를 줄이기 위해 최대 길이를 줄임
         * 그 외에은ㄴ 자르고자 하는 길이를 늘려야 하므로 최소 길이를 늘린다.
         */
        //
        long min = 0;
        long mid = 0;
        while (min < max) {
            mid = (max + min) / 2;
            long count = 0;
            for (int i = 0; i < arr.length; i++) {
                count += (arr[i] / mid);
            }
            if (count < n) {
                max = mid;
            }else{
                min = mid + 1;
            }
        }
        System.out.println(min - 1);
    }
}

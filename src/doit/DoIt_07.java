package doit;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class DoIt_07 {
    //1940
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 받는 숫자 갯수
        int m = sc.nextInt(); // goal
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        int start = 0;
        int end = n-1;
        int count =0;
        int sum;
        while (start != end) {
            sum = arr[start] + arr[end];
            if (sum == m) {
                count++;
                end--;
            } else if (sum < m) {
                start++;
            } else {
                end--;
            }
        }
        System.out.println(count);

    }
}

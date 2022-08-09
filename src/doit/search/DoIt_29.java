package doit.search;

import java.util.Arrays;
import java.util.Scanner;

public class DoIt_29 {
    public static void main(String[] args) {

        //1920
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] goal = new int[m];
        Arrays.sort(arr);
        int[] ans = new int[m];
        for (int i = 0; i < m; i++) {
            goal[i] = sc.nextInt();
        }

        for (int i = 0; i < m; i++) {
            int answer = 0;
            int start=0;
            int end = n-1;
            int find = goal[i];
            while (start <= end) {
                int mid = (start + end) / 2;
                if (arr[mid] > find) {
                    end = mid - 1;
                } else if (arr[mid] < find) {
                    start = mid + 1;
                } else {
                    answer++;
                    break;
                }
            }
            ans[i] = answer;
        }
        for (int a : ans) {
            System.out.println(a);
        }

    }
}

package chapter8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class DfsBfs05 {
    static int n;
    static int m;
    static Integer[] arr;
    static int min = Integer.MAX_VALUE;
    public static void Solution(int num,int sum) {
        if(m < sum) return;
        if(num>=min) return;
        if(m == sum){
            min = Math.min(min, num);
        }else{
            for (int a : arr) {
                Solution(num + 1, sum + a);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new Integer[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr, Collections.reverseOrder());
        m = sc.nextInt();
        Solution(0,0);
        System.out.println(min);
    }
}

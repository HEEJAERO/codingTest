package inflearn.chapter3;

import java.util.Scanner;

public class TwoPointers3 {
    public static int Solution(int[] arr,int n,int m){
        int max = 0;
        for(int i=0;i<m;i++) {
            max += arr[i];
        }
        int sum = max;
        for (int i = m; i < n; i++) {
            sum += arr[i];
            sum -= arr[i - m];
            max=Math.max(max,sum);
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(Solution(arr,n,m));
    }
}

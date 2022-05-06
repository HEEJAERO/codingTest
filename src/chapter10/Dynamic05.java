package chapter10;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Dynamic05 {

    /*public static int Solution(Integer[] arr, int n, int sum) {
        int answer = 0;
        int i=0;
        while (sum > 0) {
            if(sum>=arr[i]){
                sum -= arr[i];
                answer++;
            }else{
                i++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = sc.nextInt();
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println(Solution(arr, n, sum));
    }*/
    static int n;
    static int m;
    static int[] dy;
    public static int Solution(int[] coin) {
        int answer = 0;
        Arrays.fill(dy,Integer.MAX_VALUE);
        dy[0] = 0;
        for(int i=0;i<n;i++){
            for(int j=coin[i];j<=m;j++){
                dy[j] = Math.min(dy[j], dy[j - coin[i]] + 1);
            }
        }
        return dy[m];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        m = sc.nextInt();
        dy = new int[m + 1];
        System.out.println(Solution(arr));
    }
}

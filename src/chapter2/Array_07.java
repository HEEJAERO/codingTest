package chapter2;

import java.util.Scanner;

public class Array_07 {
    public static int Solution(int[] arr) {
        int answer = 0;
        int count = 1;
        for(int i=0;i<arr.length;i++){
            if (arr[i] == 1) {
                answer+=count;
                count++;
            }else{
                count = 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(Solution(arr));
    }
}

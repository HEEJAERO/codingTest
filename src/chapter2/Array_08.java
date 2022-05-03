package chapter2;

import java.util.Scanner;

public class Array_08 {
    public static int[] Solution(int[] arr) {
        int[] answer = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            int seq = 1;
            for(int j=0;j<arr.length;j++){
                if(i==j) continue;
                else if(arr[j]>arr[i]){
                    seq++;
                }
            }
            answer[i] = seq;
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
        for (int x : Solution(arr)) {
            System.out.print(x + " ");
        }

    }

}

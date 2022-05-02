package chapter6;

import java.util.Arrays;
import java.util.Scanner;

public class SortingSearching06 {
    public static int[] Solution(int n, int[] arr){
        int[] answer = new int[2];
        int[] copy = arr.clone();

        Arrays.sort(arr);
        int count = 0;
        for(int i=0;i<n;i++){
            if(arr[i]!=copy[i]){
                answer[count]=i+1;
                count++;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int x: Solution(n,arr)){
            System.out.print(x+" ");
        }
    }
}

package inflearn.chapter3;

import java.util.Arrays;
import java.util.Scanner;

public class TwoPointers {
    public static int[] Solution(int[] arr1,int[] arr2,int n, int m){
        int[] answer = new int[n+m];
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int i = 0;
        int j = 0;
        while(true){
            if(i==n) {
                answer[i+j] = arr2[j++];
            }else if(j==m){
                answer[i+j] = arr1[i++];
            }
            else if(arr1[i]<arr2[j]){
                answer[i+j] = arr1[i++];

            }else{
                answer[i+j] = arr2[j++];
            }
            if((n+m) == i+j) break;
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for(int i=0;i<n;i++){
            arr1[i]= sc.nextInt();
        }
        int m = sc.nextInt();
        int[] arr2 = new int[m];
        for(int i=0;i<m;i++){
            arr2[i]= sc.nextInt();
        }
        for(int x: Solution(arr1,arr2,n,m)) {
            System.out.print(x+" ");
        }
    }
}

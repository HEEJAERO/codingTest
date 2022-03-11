package chapter3;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TwoPointers2 {
    public static List<Integer> Solution(int[] arr1, int[] arr2, int n, int m){
        List<Integer> answer = new ArrayList<>();

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int i = 0;
        int j = 0;
        while(i<n &&j<m){
            if(arr1[i]==arr2[j]){
                answer.add(arr1[i++]);
                j++;
            }else if(arr1[i]>arr2[j]){
                j++;
            }else{
                i++;
            }
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

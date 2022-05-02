package chapter6;

import java.util.Scanner;
//선택 정렬
public class Sorting_Search_01 {
    public static int[] Solution(int[] arr){
        for(int i=0;i<arr.length;i++){
            int idx = i;
            for(int j=i+1;j< arr.length;j++){
                if(arr[j]<arr[idx]) idx=j;
            }
            int temp = arr[i];
            arr[i]=arr[idx];
            arr[idx] = temp;
        }
        return arr;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        for(int x: Solution(arr)){
            System.out.print(x + " ");
        }



    }
}

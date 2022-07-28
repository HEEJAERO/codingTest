package inflearn.chapter2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
// 앞수보다 큰수만 출력

public class Array_01 {
    public static List<Integer> Solution(int[] arr){

        List<Integer> a = new ArrayList<>();
        a.add(arr[0]);
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>arr[i-1]) a.add(arr[i]);
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }
        for(int i:Solution(arr)){
            System.out.print(i+" ");
        }
    }
}

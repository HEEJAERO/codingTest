package chapter6;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class SortingSearching05 {
    // 전부 다 탐색
    /*public static String Solution(int n,int[] arr){
        for(int i=0;i<n-1;i++){
            int tmp = arr[i];
            for(int j=i+1;j<n;j++){
                if(arr[j]==tmp){
                    return "D";
                }
            }
        }
        return "U";
    }*/
    //정렬
    /*public static String Solution(int n,int[] arr){
        Arrays.sort(arr);
        for(int i=0;i<n-1;i++){
            if(arr[i]==arr[i+1]) return "D";
        }
        return "U";
    }*/
    //hashMap
    public static String Solution(int n,int[] arr){
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int count = 1;
        for(int i=0;i<n;i++){
            if(hashMap.containsKey(arr[i])){
                return "D";
            }
            else hashMap.put(arr[i],count);
        }
        return "U";
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(Solution(n, arr));
    }
}

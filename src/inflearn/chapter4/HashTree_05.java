package inflearn.chapter4;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class HashTree_05 {
    public static int Solution(int n, int m, int[] arr){
        TreeSet<Integer> tree = new TreeSet<>(Collections.reverseOrder());
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                     tree.add(arr[i]+arr[j]+arr[k]);
                }
            }
        }
        int count = 0;
        int answer=-1;
        for(int x: tree){
            count++;
            if(count == m) {
                answer =x;
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.print(Solution(n,m,arr));
    }
}

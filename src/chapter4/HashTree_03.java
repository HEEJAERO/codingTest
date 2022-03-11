package chapter4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class HashTree_03 {
    public static List<Integer> Solution(int n, int m, int[] arr){
        List<Integer> answer = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<m;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        answer.add(map.size());
        for(int i=m;i<n;i++){
            map.put(arr[i-m],map.get(arr[i-m])-1);
            if(map.get(arr[i-m])==0 ) map.remove(arr[i-m]);
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            answer.add(map.size());
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        for(int i: Solution(n,m,arr))
            System.out.print(i+" ");
    }
}

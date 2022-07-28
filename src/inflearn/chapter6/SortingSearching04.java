package inflearn.chapter6;

import java.util.*;

public class SortingSearching04 {

    //LRU
    public static int[] Solution(int size,int m,int[] arr){
        //가장 오래 사용이 되지않은 메모리 삭제, 이미 메모리상 존재하면 팝
        int[] cache = new int[size];
        for (int x : arr) {
            int pos = -1;
            for(int i =0; i<size;i++){
                if(cache[i] == x){
                    pos = i;
                }
            }
            if(pos==-1){// 히트 아닐떄
                for (int i = size-1; i > 0; i--) {
                    cache[i]=cache[i-1];
                }

            }else{ // 히트 일때
                for (int i = pos; i > 0; i--) {
                    cache[i]=cache[i-1];
                }
            }
            cache[0]=x;
        }
        return cache;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[m];
        for(int i=0;i<m;i++){
            arr[i] = sc.nextInt();
        }
        for(int x: Solution(n, m, arr)){
            System.out.print(x + " ");
        }
    }
}

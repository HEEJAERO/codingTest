package inflearn.chapter2;

import java.util.Scanner;

public class Array_06 {
    public static boolean isPrime(int num){
        if(num==1) return false;
        int[] arr = new int[num+1];
        for(int i=2;i<num;i++) {
            if(num%i==0) return false;
        }
        return true;
    }
    public static void Solution(int n,int[] arr){
        for(int i=0;i<n;i++){
            int tmp = arr[i];
            int res=0;
            while(tmp>0) {
                int t = tmp % 10;
                tmp = tmp / 10;
                res = res * 10 + t;
            }
            if(isPrime(res)){
                System.out.print(res+" ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
       Solution(n,arr);
    }
}

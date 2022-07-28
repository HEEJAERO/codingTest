package inflearn.chapter8;

import java.util.Scanner;

public class dfsBfs02 {
    static int c,n;
    static int answer = -1;
    public static void Solution(int seq,int sum, int[] arr){
        if(sum>c) return;
        if(seq==n){
            answer = Math.max(answer, sum);
        }
        else{
            Solution(seq+1,sum+arr[seq],arr);
            Solution(seq+1,sum,arr);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        c = sc.nextInt();
        n = sc.nextInt();
        int[] arr= new int[n];
        for(int i = 0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Solution(0,0,arr);
        System.out.println(answer);
    }
}

package inflearn.chapter10;

import java.util.Scanner;

public class Dynamic03 {
    public static int Solution(int[] arr,int n){
        int answer =0 ;
        int[] dy = new int[n];
        dy[0]=1;
        for(int i=1;i<n;i++){
            int max = 0 ;
            for(int j=0;j<i;j++){
                if(arr[j]<arr[i] && dy[j]>max) max = dy[j];
            }
            dy[i] = max + 1;
            answer = Math.max(dy[i], answer);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(Solution(arr,n));
    }
}

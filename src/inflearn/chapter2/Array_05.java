package inflearn.chapter2;

import java.util.Scanner;
//소수-에라토스테네스의 채
public class Array_05 {
    public static int Solution(int n){
        int answer = 0;
        int[] arr= new int[n+1];

        for(int i=2;i<=n;i++){
            if(arr[i]==0){
                answer++;
                for(int j=i;j<=n;j+=i){
                    arr[j]=1;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Solution(n));
    }
}

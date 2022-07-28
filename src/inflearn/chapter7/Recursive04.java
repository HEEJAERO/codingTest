package inflearn.chapter7;

import java.util.Scanner;

public class Recursive04 {
    static int fibo[];
    public static int Solution(int x){
       /* if(x==2 || x==1) return 1;

        return Solution(x - 1) + Solution(x - 2);*/

        if(fibo[x]>0) return fibo[x];// 이 조건이면, 이미 구한 값이라는뜻
        if(x==2||x==1) return fibo[x]=1;
        return fibo[x] = Solution(x-1) + Solution(x-2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 45;
        fibo = new int[x + 1];
        Solution(x);
        for(int i=1;i<=x;i++)
            System.out.print(fibo[i]+" ");
    }
}

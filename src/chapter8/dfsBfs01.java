package chapter8;

import java.util.Scanner;

public class dfsBfs01 {
    // 부분집합-아마존 코딩 인터뷰
    static boolean result=false;

    static int[] arr;
    static boolean[] ch ;
    static int n;
    public static void Solution(int x){
        if(x>=n) return;
        int left = 0;
        int right = 0;
        for(int i=0;i<n;i++){
            if(ch[i]==true) left+=arr[i];
            else right+=arr[i];
        }
        if(right==left){
            result=true;
            return;
        }
        for(int i=0;i<n;i++){
            if(ch[i]==true) continue;
            ch[i]=true;
            Solution(x+1);
            ch[i]=false;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n];
        ch = new boolean[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Solution(0);
        if(result) System.out.println("YES");
        else System.out.println("NO");
    }
}

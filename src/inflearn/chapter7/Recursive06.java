package inflearn.chapter7;

import java.util.Scanner;

public class Recursive06 {
    static int n;
    static int[] ch;
    public static void Solution(int L){
        if (L == n + 1) {
            //종착점 - 부분집합 1개가 출력됨
            String tmp = "";
            for(int i = 1;i< n+1;i++){
                if (ch[i] == 1) {
                    tmp +=(i+" ");
                }
            }
            System.out.println(tmp);
        }else{
            ch[L] = 1;// L 번째 숫자를 부분집합에 포함
            Solution(L+1);
            ch[L] = 0; // 포함하지 않음
            Solution(L+1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = 3;
        ch = new int[n + 1];
        Solution(1);
    }
}

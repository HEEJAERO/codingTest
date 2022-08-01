package doit.datastructure;

import java.util.Scanner;
//백준 브론즈2 -11720번
public class DoIt_01 {
    public static int Solution(int n, char[] arr) {
        int answer = 0;
        for(int i=0;i<n;i++){
            answer += Character.getNumericValue(arr[i]);
            // answer+= (arr[i]-'48');
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        char[] arr= s.toCharArray();
        System.out.println(Solution(n,arr));
    }
}

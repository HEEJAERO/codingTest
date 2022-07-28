package doit;

import java.util.Scanner;
// 브론즈1-1546번
// 1. 입력과정에서 max 값 선정
// 2. 다 입력받고 Arrays.sort 하고 마지막 인덱스 값이 max
public class DoIt_02 {
    static int n;
    static int m;
    public static float Solution(int n,int max,int[] arr) {
        float answer = 0;
        for(int i =0;i<arr.length;i++){
            answer += (float)arr[i]/max*100;
        }
        answer /= n;
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[n];
        int max=0;
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            if(max<arr[i]) max = arr[i];
        }
        System.out.println(Solution(n,max,arr));
    }
}

package doit.sort;

import java.util.Arrays;
import java.util.Scanner;

/*public class DoIt_18 {
    public static void main(String[] args) {
        //11399 - 선택정렬
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] sum = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=1;i<n;i++){
            int index = i;
            int value = arr[i];
            for(int j = i-1;j>=0;j--){
                if (arr[j] < arr[i]) {
                    index = j+1;
                    break;
                }
                if(j==0){
                    index = 0;
                }
            }
            for(int j =i;j>index;j--){
                arr[j] = arr[j - 1];
            }
            arr[index] = value;
        }
        sum[0]=arr[0];
        for(int i = 1;i<n;i++){
            sum[i] = sum[i - 1] + arr[i];
        }
        int answer = 0;
        for (int a : sum) {
            answer += a;
        }
        System.out.println(answer);
    }
}*/

public class DoIt_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] s = new int[n];
        int sum =0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        s[0] = arr[0];
        for(int i=1;i<n;i++){
            s[i] = s[i - 1] + arr[i];
        }
        for (int a : s) {
            sum += a;
        }
        System.out.println(sum);
    }
}
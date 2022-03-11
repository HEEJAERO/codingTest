package this_is_codingtest;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
public class p92 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(n);
        System.out.println(m);
        System.out.println(k);
        int count=0;
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        int result=0;
        Arrays.sort(arr);
        System.out.println(arr[n-1]);
        System.out.println(arr[n-2]);

        /*for (int i = 0; i < m; i++) {
            System.out.println(result);
            if(count==k){
                count=0;
                result += arr[n-2];
            }else{
                result += arr[n-1];
                count++;
            }
        }*/
        int a= m/(k+1);
        result = (a+(m%(k+1)))*k*arr[n-1]+ a*arr[n-2];
        System.out.println(result);

    }
}

package doit.datastructure;

import java.util.Arrays;
import java.util.Scanner;

public class DoIt_08 {
    //1253 _ 좋은수 구하기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextLong();
        }
        Arrays.sort(arr);

        int start;
        int end;
        long sum;
        long goal;
        int count = 0;
        for (int i = n-1; i >= 0; i--) {
            start = 0;
            end = n-1;
            goal = arr[i];
            while (start < end) {
                sum = arr[start] + arr[end];
                if (sum == goal) {
                    if (start != i && end != i) {
                        count++;
                        break;
                    }else if(start==i){
                        start++;
                    } else if (end == i) {
                        end--;
                    }
                } else if (sum > goal) {
                    end--;
                }else{
                    start++;
                }
            }

        }
        System.out.println(count);

    }
}

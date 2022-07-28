package doit;

import java.util.Scanner;

//2018 - 투 포인터
public class DoIt_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 1;
        int start = 1;
        int end = 1;
        int count = 1;
        while(end<n){
            if (sum == n) {

                count++;
                end++;
                sum += end;
            } else if (sum < n) {
                end++;
                sum += end;
            }else{
                sum -= start;
                start++;
            }
        }
        System.out.println(count);

    }
}

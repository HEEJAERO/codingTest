package baekjoon.dynamic;

import java.util.Scanner;

public class B2579 {
    // 계단오르기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        SumStair[] sum = new SumStair[n + 1];
        sum[0] = new SumStair(0, false);
        sum[1] = new SumStair(sc.nextInt(), false);
        for (int i = 2; i <= n; i++) {
            int tmp = sc.nextInt();
            sum[i] = new SumStair();
            if(!sum[i-1].before){
                if (sum[i - 1].max > sum[i - 2].max) {
                    sum[i].max = tmp + sum[i - 1].max;
                    sum[i].before = true;
                }else{
                    sum[i].max = tmp + sum[i - 2].max;
                    sum[i].before = false;
                }
            }else{
                sum[i].max = tmp + sum[i - 2].max;
                sum[i].before = false;
            }
        }
        System.out.println(sum[n].max);
    }
    static class SumStair {
        int max;
        boolean before;
        public SumStair(){

        }
        public SumStair(int sum, boolean before) {
            this.max = sum;
            this.before = before;
        }
    }
}


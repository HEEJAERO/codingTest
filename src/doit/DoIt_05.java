package doit;

import java.util.Arrays;
import java.util.Scanner;

public class DoIt_05 {
    // 05. 나머지 합 구하기 -> 백준 10986
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        long[] s = new long[n];
        long[] count = new long[m];
        int answer = 0;
        Arrays.fill(count, 0);
        s[0] = sc.nextInt();
        for(int i=1;i<n;i++){
            s[i] = s[i - 1] + sc.nextInt();
        }
        for(int i=0;i<n;i++){
            s[i] = s[i] % m;
            count[(int)s[i]]++;
        }
        answer += count[0];
        for(int i=0;i<m;i++){
            if(count[i]>1){
                answer += (count[i] * (count[i] - 1)) / 2;
            }
        }
        System.out.println(answer);

    }
}

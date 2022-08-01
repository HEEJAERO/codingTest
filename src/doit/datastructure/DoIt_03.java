package doit.datastructure;

import java.io.IOException;
import java.util.Scanner;
//  실버4 - 11659
// 구간합을 구할때 1
public class DoIt_03 {

    static int n;
    static int m;
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        int[] s = new int[n + 1]; // 합 배열
        int[] a = new int[n + 1]; // 데이터를 저장할 배열
        int[] answer = new int[m]; // 결과 출력 배열
        s[0] = 0;
        a[0] = 0;
        for (int i = 1; i <= n; i++) {
            a[i] = sc.nextInt();
            s[i] = s[i - 1] + a[i];
        }
        for(int i=0;i<m;i++){
            int start = sc.nextInt();
            int end = sc.nextInt();
            answer[i] = s[end] - s[start - 1];
        }

        for (int ans : answer) {
            System.out.println(ans);
        }
    }
}

package baekjoon.greedy;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class B25418 {
    // 정수  a 를 k  로 만들기
    //  이문제를 k 를 a 로 만든다고 생각하고 풀면 훨씬 수월, 그리디로 해결
    static int answer = Integer.MAX_VALUE;
    static int a;
    static int k;

    public static void main(String[] args) {
        // 정수 a 를 k 로 만들기
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        k = sc.nextInt();
        //System.out.println(bfs_25418(a));
        int count = 0;
        while (a != k) {
            if (k >= 2 * a) {
                if (k % 2 == 1) {
                    k--;
                    count++;
                }
                k /= 2;
            }
            else {
                k--;
            }
            count++;
        }
        System.out.println(count);

    }
}


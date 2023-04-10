package baekjoon.dynamic;

import java.util.Scanner;

public class B2579 {
    // 계단오르기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n + 1];
        int[] maxScore = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
            if(i==1){
                maxScore[i] = arr[i];
            } else if (i == 2) {
                maxScore[i] = arr[i] + arr[i - 1];
            } else {
                maxScore[i] = Math.max(maxScore[i - 2], maxScore[i - 3] + arr[i - 1]) + arr[i];
                // n-1 로 계산하 경우, maxScore[n-1] 이 연속해서 계단을 밟아서 만들어진 값일수도있음
                // 따라서 maxScore[n-1] 을 maxScore[n-3]+arr[i-1] 로 대체하여 연속해서 밟지않음을 보장해야함
            }
        }
        System.out.println(maxScore[n]);

    }
  /*  public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        int[] DP = new int[N + 1];
        int[] arr = new int[N + 1];


        for (int i = 1; i <= N; i++) {
            arr[i] =in.nextInt();
        }

        // index = 0 은 시작점이므로 0이다.
        DP[1] = arr[1];

        // N 이 1이 입력될 수도 있기 때문에 예외처리를 해줄 필요가 있다.
        if (N >= 2) {
            DP[2] = arr[1] + arr[2];
        }

        for (int i = 3; i <= N; i++) {
            DP[i] = Math.max(DP[i - 2] , DP[i - 3] + arr[i - 1]) + arr[i];
        }
        for (int i = 0; i <= N; i++) System.out.println(DP[i]);


    }*/
}


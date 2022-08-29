package baekjoon.bruteforcing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class B18111 {
    // 마인크래프트 - 브루트폴스 + 구현
    // 시간상 n^2 까지는 가능할듯함

    public static void main(String[] args) throws IOException {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        int b = sc.nextInt(); // 주머니에 있는 블록 갯수
//        int[][] arr = new int[n][m];
//        int max = 0;
//        int min = 257;
//
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                arr[i][j] = sc.nextInt();
//                if(max < arr[i][j]) max = arr[i][j];
//                if(min>arr[i][j]) min = arr[i][j];
//            }
//        }
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);
        int b = Integer.parseInt(s[2]);
        int[][] arr = new int[n][m];
        int max = 0;
        int min = 257;
        for (int i = 0; i < n; i++) {
            String[] s1 = br.readLine().split(" ");
            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(s1[j]);
                if(max < arr[i][j]) max = arr[i][j];
                if(min>arr[i][j]) min = arr[i][j];
            }
        }
        // 평균값을 찾고 해당 값을 만드는데 필요한 블럭을 갯수를 구해본다
        // 부족하면 goal ++ 를 하고 해당 과정을 반복하한다
        int goal = 0;
        int time_goal = Integer.MAX_VALUE;
        int count = 0;
        for(int k=max;k>=min;k--){
            int time= 0;
            int tmp = b;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    count++;
                    if(arr[i][j]> k){
                        tmp += (arr[i][j] - k);
                        time += 2*(arr[i][j] - k);
                    } else if (arr[i][j] < k) {
                        tmp -= (k - arr[i][j]);
                        time += (k - arr[i][j]);
                    }
                }
            }
            if(tmp>= 0  && time< time_goal){
                time_goal = time;
                goal = k;
            }
        }
        System.out.println(count);
        System.out.println(time_goal + " " + goal);
    }
}

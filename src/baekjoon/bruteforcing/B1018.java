package baekjoon.bruteforcing;

import java.util.Scanner;

public class B1018 {
    // 체스판 칠하기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        char[][] arr = new char[n][m];
        for (int i = 0; i < n; i++) {
            String str = sc.next();
            for (int j = 0; j < m; j++) {
                arr[i][j] = str.charAt(j);
            }
        }

        char[][] board1 = new char[8][8];
        char[][] board2 = new char[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if((i+j)%2==1) {
                    board1[i][j] = 'W';
                    board2[i][j] = 'B';
                }else{
                    board1[i][j] = 'B';
                    board2[i][j] = 'W';
                }
            }
        }

        int min = 65;
        for (int i = 0; i < n -7; i++) {
            for (int a = 0; a < m -7; a++) {
                int tmp1 = 0;
                int tmp2 = 0;
                for (int j = 0; j < 8; j++) {
                    for (int k = 0; k < 8; k++) {
                        if (arr[i + j][a + k] != board1[j][k]) tmp1++;
                        if (arr[i + j][a + k] != board2[j][k]) tmp2++;
                    }
                }
                min = Math.min(min, Math.min(tmp1, tmp2));
            }
        }
        System.out.println(min);
    }
}

package baekjoon.recursive;

import java.util.Scanner;

public class B2630 {
    static int blue = 0;
    static int white = 0;
    static int[][] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        arr = new int[N][N];
        // 1 - blue 0 - white
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        countPaper(N, 0, 0);
        System.out.println(white);
        System.out.println(blue);

    }
    static void countPaper(int N,int x, int y){
        boolean isBlue = false;
        boolean isWhite = false;
        for (int i = x; i < x+N; i++) {
            for (int j = y; j < y+N; j++) {
                if (i == x && j == y) {
                    if(arr[i][j] == 1) isBlue = true;
                    else isWhite = true;
                }else{
                    if (isBlue && arr[i][j]==0) {
                        isBlue = false;
                        break;
                    }else if(isWhite && arr[i][j]==1){
                        isWhite = false;
                        break;
                    }
                }
            }
        }
        if (!isBlue && !isWhite) {
            countPaper(N / 2, x, y);
            countPaper(N / 2, x+N / 2, y);
            countPaper(N / 2, x, y + N / 2);
            countPaper(N / 2, x + N / 2, y + N / 2);
        }else if(isBlue){
            blue++;
        }else{
            white ++;
        }
    }
}

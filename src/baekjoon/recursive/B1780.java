package baekjoon.recursive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1780 {
    // 종이의 갯수 ,실버2
    static int[][] arr;
    static int countMinusOne;
    static int countZero;
    static int countOne;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        arr = new int[n][n];
        String[] tmp;
        for(int i=0;i<n;i++) {
            tmp = br.readLine().split(" ");
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(tmp[j]);
            }
        }
        count(n, 0, 0);
        System.out.println(countMinusOne);
        System.out.println(countZero);
        System.out.println(countOne);
    }
    static void count(int n, int x, int y){
        // n*n 의 행렬이 하나의 숫자로 이루어져잇는가?
        int goal = arr[x][y];
        if(n==1){
            if (goal == -1) countMinusOne++;
            else if (goal == 0) countZero++;
            else countOne++;
            return;
        }
        boolean isTrue = true;
        for(int i=x;i<x+n;i++){
            for(int j=y;j<y+n;j++){
                if(arr[i][j] != goal){
                    isTrue = false;
                    break;
                }
            }
        }
        if(isTrue){ // 범위안의 숫자가 모두 일치한다면
            if (goal == -1){
                countMinusOne++;
            }
            else if (goal == 0) countZero++;
            else countOne++;
        }else{ // 범위안에 다른 숫자가 존재한다면
           for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                    count(n / 3, x + i * n / 3, y + j * n / 3);
                }
            }
        }
    }

}

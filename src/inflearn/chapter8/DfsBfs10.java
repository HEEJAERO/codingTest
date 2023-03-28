package inflearn.chapter8;

import java.util.Scanner;

public class DfsBfs10 {
    //10. 미로탐색(DFS)
    static  int[][] arr = new int[7][7];
    static int answer = 0;
    static int count=0;
    public static void Solution(int x, int y) {
        if(x==6 && y ==6){

        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<7;i++){
            for(int j=0;j<7;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println();
    }
}

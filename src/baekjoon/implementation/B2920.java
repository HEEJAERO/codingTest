package baekjoon.implementation;

import java.util.Scanner;

public class B2920 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String answer = "";
        int[] arr = new int[8];
        for (int i = 0; i < 8; i++) {
            arr[i] = sc.nextInt();
        }
        int tmp;
        if (arr[0]==8) {
            tmp = 1;
        } else if (arr[0] == 1) {
            tmp = -1;
        } else{
            tmp = 0;

        }
        for (int i = 1; i < 7; i++) {
            if(tmp==0) break;
            if (arr[i] - arr[i + 1]!=tmp){
                tmp=0;
                break;
            }
        }
        if(tmp==0){
            System.out.println("mixed");
        } else if (tmp == 1) {
            System.out.println("descending");
        }else{
            System.out.println("ascending");
        }

    }
}

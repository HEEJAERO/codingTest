package baekjoon.recursive;

import java.util.Scanner;

public class B1074 {
    static int count=0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int r = sc.nextInt();
        int c = sc.nextInt();
        int n = (int) Math.pow(2, N);
        find(n, r, c);
        System.out.println(count);

    }
    public static void find(int size, int r, int c){
        if(size==1) return;
        if (r < size / 2 && c < size / 2) { // 1 사분면
            find(size/2, r, c);
        }else if(r < size / 2 && c >= size / 2){  // 2 사분면
            count += (size*size)/4;
            find(size / 2, r, c - size / 2);

        }else if(r >= size / 2 && c < size / 2){ // 3 사분면
            count += (size * size) / 4 * 2;
            find(size / 2, r - size / 2, c);
        }else { // 4 사분면
            count += (size * size) / 4 * 3;
            find(size/2, r - size / 2, c - size / 2);
        }

    }

}

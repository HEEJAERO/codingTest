package baekjoon.dfs;


import java.util.Scanner;

public class B1388 {

    // 바닥 장식
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);
        char[][] arr = new char[n][m];

        int count=0;
        for (int i = 0; i < n; i++) {
            String s1 = sc.nextLine();
            char[] chars = s1.toCharArray();
            for (int j = 0; j < m; j++) {
                arr[i][j] = chars[j];
            }
        }
        for (int i = 0; i < n; i++) {
            int tmp =0;
            for (int j = 0; j < m; j++) {
                if(arr[i][j] == '|'){
                    tmp = 0;
                } else if (++tmp == 1) {
                    count++;
                }
            }
        }
        for (int i = 0; i < m; i++) {
            int tmp =0;
            for (int j = 0; j < n; j++) {
                if(arr[j][i] == '-'){
                    tmp = 0;
                } else if (++tmp == 1) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }

}

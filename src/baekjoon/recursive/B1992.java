package baekjoon.recursive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1992 {
    // 쿼드트리 , 실버 1
    static int n;
    static int[][] arr;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new int[n][n];
        for(int i=0;i<n;i++){
            String s = br.readLine();
            for(int j=0;j<n;j++){
                arr[i][j] = Character.getNumericValue(s.charAt(j));
            }
        }
        search(n, 0, 0);
        System.out.println(sb);

    }

    static void search(int n, int x, int y) {
        int num = arr[x][y];
        boolean flag = true;
        for(int i=x;i<n+x;i++){
            for(int j=y;j<n+y;j++){
                if(num!=arr[i][j]){
                    flag = false;
                    break;
                }
            }
            if(!flag) break;
        }
        if(flag){
            sb.append(num);
        }else{
            sb.append("(");
            search(n/2, x, y);
            search(n/2, x, y+n/2);
            search(n/2, x+n/2, y);
            search(n/2, x+n/2, y+n/2);
            sb.append(")");
        }
    }
}

package baekjoon.sort;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class B10989 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[10000];
        for (int i = 0; i < n; i++) {
            arr[Integer.parseInt(br.readLine())-1]++;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 10000; i++) {
            for (int j = 0; j < arr[i-1]; j++) {
                sb.append(i + "\n");
            }
        }
        System.out.println(sb);
    }
}

package baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class B2869 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int a= Integer.parseInt(s[0]);
        int b= Integer.parseInt(s[1]);
        int v = Integer.parseInt(s[2]);
        int day=1;
        day += (v -a)/ (a -b);
        if ((v - a) % (a - b) != 0) {
            day++;
        }
        System.out.println(day);
    }
}

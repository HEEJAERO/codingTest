package baekjoon.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class B11723 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Set<Integer> set = new HashSet<>();
        StringBuffer answer = new StringBuffer();
        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            String[] s = str.split(" ");

            switch (s[0]){
                case "add":
                    set.add(Integer.parseInt(s[1]));
                    break;
                case "remove":
                    set.remove(Integer.parseInt(s[1]));
                    break;
                case "check":
                    if(set.contains(Integer.parseInt(s[1]))) {
                        answer.append("1\n");
                    }else{
                        answer.append("0\n");
                    }
                    break;
                case "toggle":
                    if (set.contains(Integer.parseInt(s[1]))) {
                        set.remove(Integer.parseInt(s[1]));
                    }else{
                        set.add(Integer.parseInt(s[1]));
                    }
                    break;
                case "all":
                    for (int j = 1; j <= 20; j++) {
                        set.add(j);
                    }
                    break;
                case "empty":
                    set = new HashSet<>();
                    break;
            }
        }
        System.out.println(answer);
    }
}

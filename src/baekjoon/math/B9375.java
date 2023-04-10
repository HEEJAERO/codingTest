package baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class B9375 {
    //패션왕신해빈

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int[] answer = new int[t];
        Map<String, Integer> map;
        String[] tmp;
        for (int i = 0; i < t; i++) {
            map = new HashMap<>();
            int n = Integer.parseInt(br.readLine());
            for (int j = 0; j < n; j++) {
                tmp = br.readLine().split(" ");
                // 갯수에 Null 도 포함시킴 -> 이후 null 만 선택하는 경우를 빼줌 (-1)
                map.put(tmp[1], map.getOrDefault(tmp[1], 1) + 1);

            }
            int count =1;
            for (String s : map.keySet()) {
                count *= map.get(s);
            }
            answer[i]= count - 1;

        }
        for (int i = 0; i < t; i++) {
            System.out.println(answer[i]);
        }
    }
}

package baekjoon.map;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class B10816 {
    // 숫자 카드 2
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] cards = new int[n];
        String s = br.readLine();
        String[] str = s.split(" ");
        HashMap<Integer, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            cards[i] = Integer.parseInt(str[i]);
            map.put(cards[i],map.getOrDefault(cards[i],0)+1);
        }
        int m = Integer.parseInt(br.readLine());
        int[] kinds = new int[m];
        String s1 = br.readLine();
        str = s1.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            kinds[i] = Integer.parseInt(str[i]);
            sb.append(map.getOrDefault(kinds[i],0)+" ");
        }
        System.out.println(sb);
    }

}

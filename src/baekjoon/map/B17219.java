package baekjoon.map;

import java.util.HashMap;
import java.util.Scanner;

public class B17219 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] s1 = s.split(" ");
        int n = Integer.parseInt(s1[0]);
        int m = Integer.parseInt(s1[1]);
        HashMap<String, String> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String s2 = sc.nextLine();
            String[] str = s2.split(" ");
            map.put(str[0], str[1]);
        }
        StringBuffer answer = new StringBuffer();
        for (int i = 0; i < m; i++) {
            String goal = sc.nextLine();
            answer.append(map.get(goal) + "\n");
        }
        System.out.println(answer);

    }
}

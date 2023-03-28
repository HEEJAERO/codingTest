package baekjoon.map;

import java.util.HashMap;
import java.util.Scanner;

public class B1620 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String[] s2 = s1.split(" ");
        int n = Integer.parseInt(s2[0]);
        int m = Integer.parseInt(s2[1]);
        HashMap<String, Integer> byName = new HashMap<>();
        HashMap<Integer, String> byNum = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            String s = sc.nextLine();
            byNum.put(i, s);
            byName.put(s, i);
        }
        StringBuffer answer = new StringBuffer();
        for (int i = 0; i < m; i++) {
            String s = sc.nextLine();
            try{
                int tmp =Integer.parseInt(s);
                answer.append(byNum.get(tmp)+"\n");
            }catch(NumberFormatException e){
                answer.append(byName.get(s) + "\n");
            }
        }
        System.out.println(answer);
    }
}

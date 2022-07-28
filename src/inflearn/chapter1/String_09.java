package inflearn.chapter1;

import java.util.Scanner;

public class String_09 {
    public static int Solution(String s) {
        int answer = 0;
        /*
        s = s.replaceAll("[^0-9]", "");
        answer = Integer.parseInt(s);*/
        String tmp = "";
        for (char a : s.toCharArray()) {
            if(Character.isDigit(a)) tmp += a;
        }
        answer = Integer.parseInt(tmp);
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(Solution(s));
    }
}

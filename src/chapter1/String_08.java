package chapter1;

import java.util.Scanner;

public class String_08 {
    public static String Solution(String s) {
        String answer = "NO";
        s = s.toUpperCase().replaceAll("[^A-Z]", "");
        String str = new StringBuilder(s).reverse().toString();
        if(str.equals(s)) answer = "YES";
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(Solution(s));
    }
}

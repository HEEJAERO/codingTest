package chapter1;

import java.util.Scanner;

public class String_07 {
    public static String Solution(String s) {
        /*s = s.toLowerCase();
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i) != s.charAt(s.length()-i-1)) return "NO";
        }
        return "YES";*/
        String str = new StringBuilder(s).reverse().toString();
        if (str.equalsIgnoreCase(s)) {
            return "YES";
        }
        return "NO";

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(Solution(s));
    }
}

package inflearn.chapter1;

import java.util.*;

public class String_02 {
    public static String Solution(String str){
        String answer = "";
        for (char a : str.toCharArray()) {
            if(Character.isLowerCase(a)) answer += Character.toUpperCase(a);
            else answer += Character.toLowerCase(a);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(Solution(str));
    }
}

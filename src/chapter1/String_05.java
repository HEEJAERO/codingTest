package chapter1;

import java.util.Scanner;

public class String_05 {
    public static String Solution(String str){
        String answer;
        char[] tmp = str.toCharArray();
        int lt = 0;
        int rt = tmp.length - 1;
        while (lt < rt) {
            while (!Character.isAlphabetic(tmp[lt])) {
                lt++;
            }
            while (!Character.isAlphabetic(tmp[rt])) {
                rt--;
            }
            char temp = tmp[lt];
            tmp[lt] = tmp[rt];
            tmp[rt] = temp;
            rt--;
            lt++;
        }
        answer = String.valueOf(tmp);
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(Solution(str));
    }
}

package chapter1;

import java.util.*;
public class String_01 {
    public static int Solution(String str,char t){
        int answer = 0;
        str = str.toUpperCase();
        t = Character.toUpperCase(t);
        /*for(int i=0;i<str.length();i++){
            if (str.charAt(i) == t) {
                answer++;
            }
        }*/
        for(char x : str.toCharArray()){
            if(x==t)answer++;
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c = sc.next().charAt(0);

        System.out.println(Solution(str,c));
    }
}

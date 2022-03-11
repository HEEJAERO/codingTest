package chapter1;

import java.util.ArrayList;
import java.util.Scanner;

public class String_04 {
    //reverse사용
    /*public static ArrayList<String> Solution(int n,String[] strings){
        ArrayList<String> answer = new ArrayList<>();
        for (String str : strings) {
            String tmp = new StringBuilder(str).reverse().toString();
            answer.add(tmp);
        }
        return answer ;
    }*/
    //직접 뒤집기
    public static ArrayList<String> Solution(int n,String[] strings){
        ArrayList<String> answer = new ArrayList<>();
        for (String str : strings) {
            char[] s = str.toCharArray();
            int lt = 0;
            int rt = str.length()-1;
            while(lt<rt){
                char tmp = s[lt];
                s[lt]=s[rt];
                s[rt]=tmp;
                lt++;
                rt--;
            }
            String tmp = String.valueOf(s);
            answer.add(tmp);
        }
        return answer ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] strings = new String[n];
        for(int i=0;i<n;i++){
            strings[i] = sc.next();
        }
        for(String str:Solution(n,strings)) {
            System.out.println(str);
        }
    }
}

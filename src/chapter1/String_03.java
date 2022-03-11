package chapter1;

import java.util.Scanner;

public class String_03 {
    /*public static String Solution(String[] strings){
        int temp = 0;
        String answer="";
        for (String str : strings) {
            if(temp<str.length()) { answer = str; temp = str.length();}
        }
        return answer;
    }*/
    public static String Solution(String str){
        int temp=0;
        String answer="";
        int pos;
        while((pos=str.indexOf(' '))!=-1){
            String tmp = str.substring(0, pos);
            int len = tmp.length();
            if (len >temp ) {
                temp=len;
                answer =tmp;
            }
            str = str.substring(pos + 1);
        }
        if(str.length()>temp) answer = str;
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str= sc.nextLine();
        String[] strings = str.split(" ");
        System.out.println(Solution(str));
    }
}

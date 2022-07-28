package inflearn.chapter1;

import java.util.*;

public class String_06 {
    public static String Solution(String str){
        String answer = "";
        Set<Character> set = new HashSet<>();
        //indexOf 에서 발견되는 값이 i와 같다면 처음 나오는 문자, 다르다면 중복문자이다.
        for(int i=0;i<str.length();i++) {
            //System.out.println(str.charAt(i) +" "+ i+ " " + str.indexOf(str.charAt(i)));
            if(i == str.indexOf(str.charAt(i))){
                answer+= str.charAt(i);
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(Solution(str));
    }
}

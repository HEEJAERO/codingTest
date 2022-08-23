package baekjoon.implementation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B1259 {
    //펠린드롬수 - 정방향 역방향이 같은 경우
    //1 순차비교
    // 2. String 을 뒤집은뒤에 두개의 문자열을 비교
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        while (true) {
            String a = sc.next();
            if (a.equals("0")) {
                break;
            }
            list.add(a);
        }
        for (int i = 0; i < list.size(); i++) {
            boolean isP = true;
            int end = list.get(i).length()-1;
            String s = list.get(i);
            StringBuffer str = new StringBuffer(s);
            String reverse = str.reverse().toString();

            if(s.equals(reverse)){
                System.out.println("yes");
            }else{
                System.out.println("no");
            }
//            for (int j = 0; j <= end; j++) {
//                if (s.charAt(j) != s.charAt(end - j)) {
//                    isP = false;
//                    break;
//                }
//            }
//            if (isP) {
//                System.out.println("yes");
//            }else{
//                System.out.println("no");
//            }
        }
    }
}
